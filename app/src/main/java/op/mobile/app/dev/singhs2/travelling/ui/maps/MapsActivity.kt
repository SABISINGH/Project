package op.mobile.app.dev.singhs2.travelling.ui.maps

/**
 * Imports to migrate library and project dependencies.
 */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.maps.android.clustering.ClusterManager
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.R.raw.map_style_dark
import op.mobile.app.dev.singhs2.travelling.R.raw.map_style_retro

/**
 * MapsActivity is to load the maps. It has function to load map data(creating cluster,
 * and marking cluster). Function that changes the map style. Function to check (if - else)
 * the map style (map_style_retro & map_style_dark). Also displaying Toast message if something
 * went wrong.
 */
class MapsActivity : AppCompatActivity(), OnMapReadyCallback {
    lateinit var nMap: GoogleMap
    var isChangeStyle = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as? SupportMapFragment
        mapFragment?.getMapAsync(this)
    }

    /*
    * function to load map data(creating cluster, and marking cluster)
    */
    override fun onMapReady(googleMap: GoogleMap) {
        nMap = googleMap
        setMapStyle(googleMap)
        val companies = CompanyJSONReader(this).read()
        val clusterManager: ClusterManager<Company> = ClusterManager(this, googleMap)
        val markerCluster = CompanyMarkerCluster(this, googleMap, clusterManager)
        clusterManager.renderer = markerCluster
        clusterManager.addItems(companies)
        clusterManager.cluster()
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(companies[0].position, 10f))
    }

    /*
    * function to change map style
    */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_map_style, menu)
        return true
    }

    /*
    * function to check (if - else) the map style (map_style_retro & map_style_dark)
    * Also displaying Toast message if something went wrong.
    */
    private fun setMapStyle(googleMap: GoogleMap) {
        val isSet: Boolean = when (isChangeStyle) {
            false -> googleMap.setMapStyle(
                MapStyleOptions.loadRawResourceStyle(
                    this,
                    map_style_retro
                )
            )
            else -> googleMap.setMapStyle(
                MapStyleOptions.loadRawResourceStyle(
                    this,
                    map_style_dark
                )
            )
        }
        if (!isSet) Toast.makeText(
            this,
            getString(R.string.maps_toast_error_message),
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.changeMapStyle -> {
                isChangeStyle = if (isChangeStyle) {
                    nMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(this, map_style_retro))
                    false
                } else {
                    nMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(this, map_style_dark))
                    true
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
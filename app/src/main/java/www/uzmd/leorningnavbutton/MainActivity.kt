package www.uzmd.leorningnavbutton

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import www.uzmd.leorningnavbutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttunNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.asosiyId -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.continer, AsosiyFragment()).commit()
                    Log.d("MY_TAG", "onCreate: Asosiy bosildi")
                    true
                }

                R.id.settingId -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.continer, SettingFragment()).commit()

                    Log.d("MY_TAG", "onCreate: Setting bosildi")
                    true
                }

                R.id.katigoryId -> {

                    supportFragmentManager.beginTransaction()
                        .replace(R.id.continer, KatigoryFragment()).commit()
                    Log.d("MY_TAG", "onCreate: Katigory bosildi")
                    true
                }

                else -> {
                    false
                }
            }
        }


    }
}
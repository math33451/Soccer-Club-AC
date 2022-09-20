package br.com.mobile.soccerclub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_constraint)
    }
}
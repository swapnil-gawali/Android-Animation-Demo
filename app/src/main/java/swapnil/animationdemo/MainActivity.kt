package swapnil.animationdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnJavaAnimation.setOnClickListener {
            val intent = Intent(this, JavaAnimationActivity::class.java)
            startActivity(intent)
        }

        btnXmlAnimation.setOnClickListener {
            val intent = Intent(this, XmlAnimationActivity::class.java)
            startActivity(intent)
        }
    }
}
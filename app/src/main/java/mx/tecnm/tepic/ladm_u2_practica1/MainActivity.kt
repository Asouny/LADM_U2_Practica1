package mx.tecnm.tepic.ladm_u2_practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
  var Lienzo: Lienzo ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Lienzo = Lienzo (this)
        setContentView(Lienzo!!)


        Animacion(this).start()

    }
}
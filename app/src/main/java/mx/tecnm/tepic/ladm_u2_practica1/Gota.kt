package mx.tecnm.tepic.ladm_u2_practica1
import android.graphics.BitmapFactory
import android.graphics.BitmapFactory.decodeResource
import android.graphics.Canvas
import android.graphics.Paint

class Gota(){
    var x = 0f
    var y = 0f
    var incY = 5

    constructor(x:Int, y:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()

    }//constructor

    fun pintar(c: Canvas, p: Paint, punteroLienzo:Lienzo){
        var gota = decodeResource(punteroLienzo.resources,R.drawable.gota25)
        c.drawBitmap(gota,x,y,Paint())
    }//pintar

    fun caida(){
        y += incY
        if(y >= 1800){
            x = (50..1080).random().toFloat()
            y = (0..1920).random().toFloat() * -1
        }
    }//caida

}//class
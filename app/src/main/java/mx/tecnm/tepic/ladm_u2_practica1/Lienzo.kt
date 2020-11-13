package mx.tecnm.tepic.ladm_u2_practica1

import android.graphics.*
import android.view.View

class Lienzo(p: MainActivity) : View(p){

    var lluvia : Array<Gota> = Array(50, { Gota(0, 1600) })
    var cementerio = BitmapFactory.decodeResource(this.resources,R.drawable.fondo1)
    var tumba = BitmapFactory.decodeResource(this.resources,R.drawable.tumba)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.rgb(14,80,166))


        //CEMENTERIO DE FONDO
        canvas.drawBitmap(cementerio,0f,700f,paint)
        canvas.drawBitmap(cementerio,400f,700f,paint)
        canvas.drawBitmap(cementerio,800f,700f,paint)

        //CUADRO CEMENTERIO
        paint.style = Paint.Style.FILL
        paint.color = Color.BLACK
        canvas.drawRect(0f,1050f,1800f,1800f,paint)
        
        //LUNA
        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(253,245,183)
        canvas.drawCircle(600f,390f,350f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(255,230,127)
        canvas.drawCircle(400f, 500f,100f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(255,230,127)
        canvas.drawCircle(550f, 650f,70f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(255,230,127)
        canvas.drawCircle(570f, 520f,50f,paint)


        //Tumba
        canvas.drawBitmap(tumba,000f,700f,paint)

        //AQUI DESCANSA
        paint.color = Color.WHITE
        paint.textSize = 70f
        canvas.drawText("Aqui Descansa",400f,1000f,paint)
        //LA UNIDAD
        paint.color = Color.WHITE
        paint.textSize = 70f
        canvas.drawText("la unidad",450f,1100f,paint)
        //2
        paint.color = Color.WHITE
        paint.textSize = 400f
        canvas.drawText("2",500f,1450f,paint)

        //Lluvia
        paint.color = Color.WHITE
        paint.style = Paint.Style.FILL
        (0..49).forEach {
            lluvia[it].pintar(canvas,paint,this)
        }

        //NUVES
        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(44,61,82)
        canvas.drawCircle(0f,0f,80f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(44,61,82)
        canvas.drawCircle(100f,50f,80f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(44,61,82)
        canvas.drawCircle(200f,0f,80f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(44,61,82)
        canvas.drawCircle(300f,50f,80f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(44,61,82)
        canvas.drawCircle(400f,0f,80f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(44,61,82)
        canvas.drawCircle(500f,50f,80f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(44,61,82)
        canvas.drawCircle(600f,0f,80f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(44,61,82)
        canvas.drawCircle(700f,50f,80f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(44,61,82)
        canvas.drawCircle(800f,0f,80f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(44,61,82)
        canvas.drawCircle(900f,50f,80f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(44,61,82)
        canvas.drawCircle(1000f,0f,80f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(44,61,82)
        canvas.drawCircle(1100f,50f,80f,paint)

        paint.style  = Paint.Style.FILL
        paint.color = Color.rgb(44,61,82)
        canvas.drawCircle(1200f,0f,80f,paint)



    }

    fun animarCirculo() {
        (0..49).forEach {
            lluvia[it].caida()
        }
        invalidate()
    }
}
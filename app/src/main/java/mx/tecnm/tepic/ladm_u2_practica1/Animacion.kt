package mx.tecnm.tepic.ladm_u2_practica1


class Animacion (p:MainActivity ):Thread(){
    var puntero = p

    override fun run() {
        super.run()

        while(true){
            sleep(100)
            puntero.runOnUiThread {
                puntero.Lienzo!!.animarCirculo()
            }
        }
    }
}

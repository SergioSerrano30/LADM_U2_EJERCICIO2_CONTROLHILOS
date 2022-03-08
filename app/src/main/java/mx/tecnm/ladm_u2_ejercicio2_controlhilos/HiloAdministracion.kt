package mx.tecnm.ladm_u2_ejercicio2_controlhilos

import android.app.AlertDialog
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class HiloAdministracion(imagen: ImageView): Thread() {
    private var pausar = false
    private var ejecutar = true
    val imgEnviada = imagen
    var conta = 0
    val imagenes = arrayOf(R.drawable.iconfinder_1_3561842,R.drawable.iconfinder_10_3561843
        ,R.drawable.iconfinder_14_3561847,R.drawable.iconfinder_22_3561855,R.drawable.iconfinder_24_3561857
        ,R.drawable.iconfinder_23_3561856,R.drawable.iconfinder_25_3561840,R.drawable.iconfinder_2_3561853)
    override fun run() {
        super.run()
        conta = 0
        while (ejecutar){

            if (pausar){
                //Codigo de hilo pausado
                sleep(1000)
            }
            else{
                if (conta==imagenes.size) conta=0
                imgEnviada.setImageResource(imagenes[conta++])
                sleep(1000)
            }
        }


    }
    fun terminarHilo(){
        ejecutar = false
    }
    fun pausarHilo(){
        pausar = true
    }
    fun continuarHilo(){
        pausar = false
    }
    fun estaPausado(): Boolean{
        return pausar
    }

}
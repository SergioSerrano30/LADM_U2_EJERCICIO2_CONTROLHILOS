package mx.tecnm.ladm_u2_ejercicio2_controlhilos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import mx.tecnm.ladm_u2_ejercicio2_controlhilos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val hiloadmin: HiloAdministracion = HiloAdministracion(binding.imagen)
        binding.ejecutar.setOnClickListener {
                hiloadmin.start()
            binding.lblStatus.setText("Status: INICIADO")
        }

        binding.pausar.setOnClickListener {
            //binding.imagen.setImageResource(R.drawable.ic_baseline_pause_circle_outline_24)
            binding.lblStatus.setText("Status: PAUSA")
            hiloadmin.pausarHilo()
        }
        binding.continuar.setOnClickListener {
            binding.lblStatus.setText("Status: CONTINUA")
            hiloadmin.continuarHilo()
        }
        binding.terminar.setOnClickListener {
            //binding.imagen.setImageResource(R.drawable.ic_baseline_stop_circle_24)
            binding.lblStatus.setText("Status: Finalizado")
            hiloadmin.terminarHilo()
        }
    }

}
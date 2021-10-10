package mx.edu.tecmm.moviles.holamundoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numeroContador: TextView = findViewById(R.id.txtContador)
        numeroContador.text = "0"
        var bandera = true
        var contador = 0
        val botonAumentar : Button = findViewById(R.id.btnAumentar)
        val botonLimpiar : Button = findViewById(R.id.btnLimpiar)

        //boton con el metodo click y su funcion es aumentar hasta que sea igual a 10 y disminuir hasta que sea igual 1
        botonAumentar.setOnClickListener {
            if (bandera == true) {
                if (contador < 10) {
                    contador += 1
                    numeroContador.text = contador.toString()
                } else
                {
                    contador -= 1
                    numeroContador.text = contador.toString()
                    bandera =false
                }
            } else
            {
                if (contador > 0) {
                    contador -= 1
                    numeroContador.text = contador.toString()
                } else
                {
                    contador += 1
                    numeroContador.text = contador.toString()
                    bandera =true
                }
            }

        }

        //metodo de click para limpiar en este boton se reinicia los valores por default
        botonLimpiar.setOnClickListener {
            numeroContador.text = "0"
            contador = 0
            bandera = true
        }
    }
}
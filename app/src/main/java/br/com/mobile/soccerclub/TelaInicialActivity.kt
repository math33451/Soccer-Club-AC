package br.com.mobile.soccerclub

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.SearchView

import android.widget.Toast
import br.com.mobile.soccerclub.DebugActivity
import br.com.mobile.soccerclub.R
import br.com.mobile.soccerclub.databinding.ActivityTelaInicialBinding

class TelaInicialActivity : DebugActivity() {

    private val binding by lazy {
        ActivityTelaInicialBinding.inflate(layoutInflater)
    }

    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // acessar parametros da intnet
        // intent é um atributo herdado de Activity
        val args = intent.extras
        // recuperar o parâmetro do tipo String
        val nome = args?.getString("nome")

        // recuperar parâmetro simplificado
        val numero = intent.getIntExtra("nome", 0)

        Toast.makeText(context, "Parâmetro: $nome", Toast.LENGTH_LONG).show()
        Toast.makeText(context, "Numero: $numero", Toast.LENGTH_LONG).show()

        binding.mensagemInicial.text = "Bem vindo $nome"

        binding.botaoSair.setOnClickListener { cliqueSair() }

    }

    fun cliqueSair() {
        val returnIntent = Intent();
        returnIntent.putExtra("result", "Saída do LMSApp");
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
}

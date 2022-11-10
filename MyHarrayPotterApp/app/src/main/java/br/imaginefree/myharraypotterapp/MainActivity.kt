package br.imaginefree.myharraypotterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import br.imaginefree.myharraypotterapp.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val call: Call<List<Spells>>? = RetrofitClient.instance?.getApi()?.getSpells()
        call?.enqueue(object : Callback<List<Spells>> {

            override fun onResponse(call: Call<List<Spells>>,
                                    response: Response<List<Spells>>) {
                if (response.isSuccessful) {
                    response.body()?.let{
                        binding.listSpells.adapter = SpellsAdapter(it as ArrayList<Spells>)
                        binding.listSpells.layoutManager = LinearLayoutManager(this@MainActivity)
                        binding.progressBar1.visibility = View.GONE
                        binding.listSpells.visibility = View.VISIBLE
                    }
                }

            }

            override fun onFailure(call: Call<List<Spells>>, t: Throwable) {
                binding.progressBar1.visibility = View.GONE
                binding.error.text = "Ops, aconteceu um erro na request!"
                binding.error.visibility = View.VISIBLE
            }

        })

    }
}
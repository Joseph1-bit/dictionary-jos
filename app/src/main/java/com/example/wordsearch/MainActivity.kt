package com.example.wordsearch

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
       val id = item.itemId
        if (id == R.id.action_add_word)
        {
            val toAddword = Intent(this, Add_word::class.java)
            toAddword.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            toAddword.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            toAddword.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(toAddword)
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}

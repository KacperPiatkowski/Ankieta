package com.example.ankieta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    lateinit var sport: CheckBox;
    lateinit var muzyka: CheckBox;
    lateinit var turystyka: CheckBox;
    lateinit var gry: CheckBox;
    lateinit var WyswieltButton: Button;
    lateinit var EdytujButton:Button;
    lateinit var radioGroup: RadioGroup;
    lateinit var radioButton: RadioButton;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sport = findViewById(R.id.checkBoxSport);
        muzyka = findViewById(R.id.checkBoxMuzyka);
        turystyka = findViewById(R.id.checkBoxTurystyka);
        gry = findViewById(R.id.checkBoxGry);
        WyswieltButton = findViewById(R.id.buttonWyswietl);
        EdytujButton = findViewById(R.id.buttonEdytuj);
        radioGroup = findViewById<RadioGroup>(R.id.radioGroup)

        WyswieltButton.setOnClickListener {
            val result = StringBuilder();
            val intSelectButton: Int = radioGroup!!.checkedRadioButtonId
            radioButton = findViewById(intSelectButton)
            result.append("Wiek ", findViewById<EditText>(R.id.editTextNumberWiek).text)
            result.append("\nTwoje zainteresowania: ")

            if(sport.isChecked)
            {
                result.append("\nsport")
            }
            if(muzyka.isChecked)
            {
                result.append("\nmuzyka")
            }
            if(turystyka.isChecked)
            {
                result.append("\nmuzyka")
            }
            if(gry.isChecked)
            {
                result.append("\nturystyka")
            }
            if(gry.isChecked)
            {
                result.append("\ngry")
            }
            findViewById<RadioButton>(R.id.radioButtonKobieta).isEnabled = false;
            findViewById<RadioButton>(R.id.radioButtonMezczyzna).isEnabled = false;
            findViewById<EditText>(R.id.editTextNumberWiek).isEnabled = false;
            sport.isEnabled = false;
            muzyka.isEnabled = false;
            turystyka.isEnabled = false;
            gry.isEnabled = false;
            WyswieltButton.isEnabled = false;

            findViewById<TextView>(R.id.textView2).text = result.toString();
            Toast.makeText(applicationContext, result.toString(),Toast.LENGTH_SHORT).show()
        }
        EdytujButton.setOnClickListener {
            findViewById<RadioButton>(R.id.radioButtonKobieta).isEnabled = true;
            findViewById<RadioButton>(R.id.radioButtonMezczyzna).isEnabled = true;
            findViewById<EditText>(R.id.editTextNumberWiek).isEnabled = true;
            sport.isEnabled = true;
            muzyka.isEnabled = true;
            turystyka.isEnabled = true;
            gry.isEnabled = true;
            WyswieltButton.isEnabled = true;
        }
    }
}
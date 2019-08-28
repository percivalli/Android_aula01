package br.com.digitalhouse.aula01app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        textView = (TextView) findViewById(R.id.text_hello);
        button = (Button) findViewById( R.id.menu_button );
        editText = (EditText) findViewById( R.id.edit_text_nome );


        //final String nome = editText.getText().toString();

        //Tambem podemos fazer assim (casting)
        final Editable nome = editText.getText();

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(getApplicationContext(), ">> TESTE MENSAGEM INICIAL <<", Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), nome.toString(), Toast.LENGTH_LONG).show();


            }
        } );

    }
}

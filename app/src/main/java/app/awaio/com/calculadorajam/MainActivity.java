package app.awaio.com.calculadorajam;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText oper1,oper2;
    private TextView rspta3;
    @Override        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//recuperamos los objetos            oper1=(EditText)findViewById(R.id.txtnum1);
        oper2=(EditText)findViewById(R.id.txtnum2);
        rspta3=(EditText)findViewById(R.id.txtresultado);
    }
    public void sumar(View v){
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());
        int sum=n1+n2;
        String resultado= String.valueOf(sum);
        rspta3.setText(resultado);

    }
    public void restar(View v){
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());
        int resta=n1-n2;
        String resultado= String.valueOf(resta);
        rspta3.setText(resultado);

    }
    public void multiplicar(View v){
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());
        int mult=n1*n2;
        String resultado= String.valueOf(mult);
        rspta3.setText(resultado);

    }
    public void dividir(View v){
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());
        int div=n1/n2;
        String resultado= String.valueOf(div);
        rspta3.setText(resultado);

    }

}

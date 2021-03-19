

package mcm.edu.arjoun_basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  btnAdd, btnSub, btnDiv, btnMul, btnMod;


        btnAdd = findViewById(R.id.AddButton);
        btnSub = findViewById(R.id.MinusButton);
        btnDiv = findViewById(R.id.DivideButton);
        btnMul = findViewById(R.id.MultiplyButton);
        btnMod = findViewById(R.id.ModulusButton);



        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnMod.setOnClickListener(this);


    }
    @Override
    public void onClick(View v){
        EditText txtOperand1, txtOperand2;
        TextView txtAnswer;

        txtOperand1 = findViewById(R.id.Operand1Input);
        txtOperand2 = findViewById(R.id.Operand2Input);
        txtAnswer = findViewById(R.id.AnswerText);

        Double op1 = 0.0;
        Double op2 = 0.0;
        Double answer = 0.0;



        op1 = Double.parseDouble(txtOperand1.getText().toString());
        op2 = Double.parseDouble(txtOperand2.getText().toString());

        switch(v.getId()) {
            case R.id.AddButton:
                answer = op1 + op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.MinusButton:
                answer = op1 - op2;
                txtAnswer.setText(Double.toString(answer));

                break;
            case R.id.DivideButton:
                answer = op1 / op2;
                txtAnswer.setText(Double.toString(answer));

                break;
            case R.id.ModulusButton:
                answer = op1 % op2;
                txtAnswer.setText(Double.toString(answer));

                break;
            case R.id.MultiplyButton:
                answer = op1 * op2;
                txtAnswer.setText(Double.toString(answer));

        }


    }
}

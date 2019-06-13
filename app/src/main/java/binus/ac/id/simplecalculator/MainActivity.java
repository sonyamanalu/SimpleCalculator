package binus.ac.id.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSatu, btnDua, btnTiga, btnEmpat, btnLima,
            btnEnam, btnTujuh, btnDelapan, btnSembilan, btnNol,
            btnPlus, btnMinus, btnMultipli, btnDiv, btnEqual;

    TextView tvResult;

    float bilanganPertama, bilanganKedua;

    boolean plusBtn, minusBtn, divBtn, mulBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final String valueText;

        btnSatu = findViewById(R.id.btnSatu);
        btnDua = findViewById(R.id.btnDua);
        btnTiga = findViewById(R.id.btnTiga);
        btnEmpat = findViewById(R.id.btnEmpat);
        btnLima = findViewById(R.id.btnLima);
        btnEnam = findViewById(R.id.btnEnam);
        btnTujuh = findViewById(R.id.btnTujuh);
        btnDelapan = findViewById(R.id.btnDelapan);
        btnSembilan = findViewById(R.id.btnSembilan);
        btnNol = findViewById(R.id.btnNol);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultipli = findViewById(R.id.btnMultipli);
        btnDiv = findViewById(R.id.btnDiv);
        btnEqual = findViewById(R.id.btnEqual);
        tvResult = findViewById(R.id.tvResult);

        btnSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"1");
            }
        });

        btnDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"2");
            }
        });

        btnTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"3");
            }
        });

        btnEmpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"4");
            }
        });

        btnLima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"5");
            }
        });
        btnEnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"6");
            }
        });
        btnTujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"7");
            }
        });
        btnDelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"8");
            }
        });
        btnSembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"9");
            }
        });
        btnNol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"0");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText()==null)
                    tvResult.setText("");
                else{
                    bilanganPertama = Float.parseFloat(tvResult.getText()+"");
                    plusBtn = true;
                    tvResult.setText(null);
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText()==null)
                    tvResult.setText("");
                else{
                    bilanganPertama = Float.parseFloat(tvResult.getText()+"");
                    minusBtn = true;
                    tvResult.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText()==null)
                    tvResult.setText("");
                else{
                    bilanganPertama = Float.parseFloat(tvResult.getText()+"");
                    divBtn = true;
                    tvResult.setText(null);
                }
            }
        });
        btnMultipli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText()==null)
                    tvResult.setText("");
                else{
                    bilanganPertama = Float.parseFloat(tvResult.getText()+"");
                    mulBtn = true;
                    tvResult.setText(null);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvResult.getText()==null)
                    tvResult.setText(null);
                else {
                    bilanganKedua = Float.parseFloat(tvResult.getText() + "");
                    if (plusBtn){
                        tvResult.setText(bilanganPertama + " + " + bilanganKedua + " = " + (bilanganPertama+bilanganKedua));
                        plusBtn = false;
                    }else if (minusBtn){
                        tvResult.setText(bilanganPertama + " - " + bilanganKedua + " = " + (bilanganPertama-bilanganKedua));
                        minusBtn = false;
                    }else if (divBtn){
                        tvResult.setText(bilanganPertama + " / " + bilanganKedua + " = " + (bilanganPertama/bilanganKedua));
                        divBtn = false;
                    }else if (mulBtn){
                        tvResult.setText(bilanganPertama + " x " + bilanganKedua + " = " + (bilanganPertama*bilanganKedua));
                        mulBtn = false;
                    }
                }
            }
        });
        }
}

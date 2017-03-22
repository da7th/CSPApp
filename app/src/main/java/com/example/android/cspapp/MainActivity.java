package com.example.android.cspapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nET, thetazET, deltaET, phiET, gET, ggET, gdirET, gdifET,
            hiET, betaET, gammasET, gammaET, omegaET, thetaET;
    TextView nOutputTV, thetazOutputTV, deltaOutputTV, phiOutputTV,
            gOutputTV, ggOutputTV, gdirOutputTV, gdifOutputTV,
            hiOutputTV, betaOutputTV, gammasOutputTV, gammaOutputTV,
            omegaOutputTV, thetaOutputTV;
    Button calcBtn;
    public String mNInput,mThetazInput,mDeltaInput;
    public Boolean nETValue, thetazETValue, deltaETValue, phiETValue,
            gETValue, ggETValue, gdirETValue, gdifETValue, hiETValue,
            betaETValue, gammasETValue, gammaETValue, omegaETValue, thetaETValue;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //output TextViews
        nOutputTV = (TextView) findViewById(R.id.nOutputTV);
        thetazOutputTV = (TextView) findViewById(R.id.thetazOutputTV);
        deltaOutputTV = (TextView) findViewById(R.id.deltaOutputTV);
        phiOutputTV = (TextView) findViewById(R.id.phiOutputTV);
        gOutputTV = (TextView) findViewById(R.id.GOutputTV);
        ggOutputTV = (TextView) findViewById(R.id.GgOutputTV);
        gdirOutputTV = (TextView) findViewById(R.id.GdirOutputTV);
        gdifOutputTV = (TextView) findViewById(R.id.GdifOutputTV);
        hiOutputTV = (TextView) findViewById(R.id.H_IOutputTV);
        betaOutputTV = (TextView) findViewById(R.id.betaOutputTV);
        gammasOutputTV = (TextView) findViewById(R.id.gammasOutputTV);
        gammaOutputTV = (TextView) findViewById(R.id.gammaOutputTV);
        omegaOutputTV = (TextView) findViewById(R.id.omegaOutputTV);
        thetaOutputTV = (TextView) findViewById(R.id.thetaOutputTV);

        //input EditTexts
        nET = (EditText) findViewById(R.id.n_input);
        thetazET = (EditText) findViewById(R.id.thetaz_input);
        deltaET = (EditText) findViewById(R.id.delta_input);
        phiET = (EditText) findViewById(R.id.phi_input);
        gET = (EditText) findViewById(R.id.G_input);
        ggET = (EditText) findViewById(R.id.Gg_input);
        gdirET = (EditText) findViewById(R.id.Gdir_input);
        gdifET = (EditText) findViewById(R.id.Gdif_input);
        hiET = (EditText) findViewById(R.id.H_I_input);
        betaET = (EditText) findViewById(R.id.beta_input);
        gammasET = (EditText) findViewById(R.id.gammaS_input);
        gammaET = (EditText) findViewById(R.id.gamma_input);
        omegaET = (EditText) findViewById(R.id.omega_input);
        thetaET = (EditText) findViewById(R.id.theta_input);

        //calculate Button
        calcBtn = (Button) findViewById(R.id.calc_button);

        //Button ClickListener
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Check for the edited fields
                mNInput = nET.getText().toString().trim();
                if (!mNInput.isEmpty() && mNInput.length()!=0) {
                    nETValue = true;
                }else{
                    nETValue = false;
                }








                //Execute the output printing functions
                delta();
            }
        });

    }

    void delta() {
        if (nETValue){
            double n = Integer.parseInt(mNInput);
            double delta = 23.45*Math.sin(360*((284+n)/365));
            nOutputTV.setText("delta:" + delta);
        } else{
            nOutputTV.setText("delta:" + " - ");;
        }
    }



}

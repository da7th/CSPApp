package com.example.android.cspapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText nET, thetazET, deltaET, phiET, gET, ggET, gdirET, gdifET,
            hiET, betaET, gammasET, gammaET, omegaET, thetaET;
    public TextView nOutputTV, thetazOutputTV, deltaOutputTV, phiOutputTV,
            gOutputTV, ggOutputTV, gdirOutputTV, gdifOutputTV,
            hiOutputTV, betaOutputTV, gammasOutputTV, gammaOutputTV,
            omegaOutputTV, thetaOutputTV;
    public Button calcBtn;
    public String nETValueInput, thetazETValueInput, deltaETValueInput,
            phiETValueInput, gETValueInput, ggETValueInput, gdirETValueInput,
            gdifETValueInput, hiETValueInput, betaETValueInput,
            gammasETValueInput, gammaETValueInput, omegaETValueInput, thetaETValueInput;
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
                check_edited_fields();


                //Execute the output printing functions
                delta();
            }
        });

    }

    void check_edited_fields(){

        nETValueInput = nET.getText().toString().trim();
        if (!nETValueInput.isEmpty() && nETValueInput.length()!=0) {
            nETValue = true;
        }else{
            nETValue = false;
        }

        thetazETValueInput = nET.getText().toString().trim();
        if (!thetazETValueInput.isEmpty() && thetazETValueInput.length()!=0) {
            thetazETValue = true;
        }else{
            thetazETValue = false;
        }

        deltaETValueInput = nET.getText().toString().trim();
        if (!deltaETValueInput.isEmpty() && deltaETValueInput.length()!=0) {
            deltaETValue = true;
        }else{
            deltaETValue = false;
        }

        phiETValueInput = nET.getText().toString().trim();
        if (!phiETValueInput.isEmpty() && phiETValueInput.length()!=0) {
            phiETValue = true;
        }else{
            phiETValue = false;
        }

        gETValueInput = nET.getText().toString().trim();
        if (!gETValueInput.isEmpty() && gETValueInput.length()!=0) {
            gETValue = true;
        }else{
            gETValue = false;
        }

        ggETValueInput = nET.getText().toString().trim();
        if (!ggETValueInput.isEmpty() && ggETValueInput.length()!=0) {
            ggETValue = true;
        }else{
            ggETValue = false;
        }

        gdirETValueInput = nET.getText().toString().trim();
        if (!gdirETValueInput.isEmpty() && gdirETValueInput.length()!=0) {
            gdirETValue = true;
        }else{
            gdirETValue = false;
        }

        hiETValueInput = nET.getText().toString().trim();
        if (!hiETValueInput.isEmpty() && hiETValueInput.length()!=0) {
            hiETValue = true;
        }else{
            hiETValue = false;
        }

        betaETValueInput = nET.getText().toString().trim();
        if (!betaETValueInput.isEmpty() && betaETValueInput.length()!=0) {
            betaETValue = true;
        }else{
            betaETValue = false;
        }

        gammasETValueInput = nET.getText().toString().trim();
        if (!gammasETValueInput.isEmpty() && gammasETValueInput.length()!=0) {
            gammasETValue = true;
        }else{
            gammasETValue = false;
        }

        gammaETValueInput = nET.getText().toString().trim();
        if (!gammaETValueInput.isEmpty() && gammaETValueInput.length()!=0) {
            gammaETValue = true;
        }else{
            gammaETValue = false;
        }

        omegaETValueInput = nET.getText().toString().trim();
        if (!omegaETValueInput.isEmpty() && omegaETValueInput.length()!=0) {
            omegaETValue = true;
        }else{
            omegaETValue = false;
        }

        thetaETValueInput = nET.getText().toString().trim();
        if (!thetaETValueInput.isEmpty() && thetaETValueInput.length()!=0) {
            thetaETValue = true;
        }else{
            thetaETValue = false;
        }

        gdifETValueInput = nET.getText().toString().trim();
        if (!gdifETValueInput.isEmpty() && gdifETValueInput.length()!=0) {
            gdifETValue = true;
        }else{
            gdifETValue = false;
        }

    }



    void delta() {
        if (nETValue){
            double n = Integer.parseInt(nETValueInput);
            double delta = 23.45*Math.sin(360*((284+n)/365));
            nOutputTV.setText("delta:" + delta);
        } else{
            nOutputTV.setText("delta:" + " - ");;
        }
    }



}

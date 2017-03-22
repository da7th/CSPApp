package com.example.android.cspapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.android.cspapp.R.id.GgOutputTV;

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
        ggOutputTV = (TextView) findViewById(GgOutputTV);
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
                for (int i = 0 ; i < 5 ; i++){
                    n();
                    delta();
                    thetaz();
                    phi();
                    G();
                    Gg();
                    Gdir();
                    Gdif();
                    H_I();
                    beta();
                    gammaS();
                    gamma();
                    omega();
                    theta();
                }

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

        thetazETValueInput = thetazET.getText().toString().trim();
        if (!thetazETValueInput.isEmpty() && thetazETValueInput.length()!=0) {
            thetazETValue = true;
        }else{
            thetazETValue = false;
        }

        deltaETValueInput = deltaET.getText().toString().trim();
        if (!deltaETValueInput.isEmpty() && deltaETValueInput.length()!=0) {
            deltaETValue = true;
        }else{
            deltaETValue = false;
        }

        phiETValueInput = phiET.getText().toString().trim();
        if (!phiETValueInput.isEmpty() && phiETValueInput.length()!=0) {
            phiETValue = true;
        }else{
            phiETValue = false;
        }

        gETValueInput = gET.getText().toString().trim();
        if (!gETValueInput.isEmpty() && gETValueInput.length()!=0) {
            gETValue = true;
        }else{
            gETValue = false;
        }

        ggETValueInput = ggET.getText().toString().trim();
        if (!ggETValueInput.isEmpty() && ggETValueInput.length()!=0) {
            ggETValue = true;
        }else{
            ggETValue = false;
        }

        gdirETValueInput = gdirET.getText().toString().trim();
        if (!gdirETValueInput.isEmpty() && gdirETValueInput.length()!=0) {
            gdirETValue = true;
        }else{
            gdirETValue = false;
        }

        hiETValueInput = hiET.getText().toString().trim();
        if (!hiETValueInput.isEmpty() && hiETValueInput.length()!=0) {
            hiETValue = true;
        }else{
            hiETValue = false;
        }

        betaETValueInput = betaET.getText().toString().trim();
        if (!betaETValueInput.isEmpty() && betaETValueInput.length()!=0) {
            betaETValue = true;
        }else{
            betaETValue = false;
        }

        gammasETValueInput = gammasET.getText().toString().trim();
        if (!gammasETValueInput.isEmpty() && gammasETValueInput.length()!=0) {
            gammasETValue = true;
        }else{
            gammasETValue = false;
        }

        gammaETValueInput = gammaET.getText().toString().trim();
        if (!gammaETValueInput.isEmpty() && gammaETValueInput.length()!=0) {
            gammaETValue = true;
        }else{
            gammaETValue = false;
        }

        omegaETValueInput = omegaET.getText().toString().trim();
        if (!omegaETValueInput.isEmpty() && omegaETValueInput.length()!=0) {
            omegaETValue = true;
        }else{
            omegaETValue = false;
        }

        thetaETValueInput = thetaET.getText().toString().trim();
        if (!thetaETValueInput.isEmpty() && thetaETValueInput.length()!=0) {
            thetaETValue = true;
        }else{
            thetaETValue = false;
        }

        gdifETValueInput = gdifET.getText().toString().trim();
        if (!gdifETValueInput.isEmpty() && gdifETValueInput.length()!=0) {
            gdifETValue = true;
        }else{
            gdifETValue = false;
        }

    }



    void delta() {
        if (deltaETValue) {
            double delta = Double.parseDouble(deltaET.getText().toString());
            deltaOutputTV.setText("delta:" + delta);
        }else if (nETValue){
            double n = Integer.parseInt(nETValueInput);
            double delta = 23.45*Math.sin(360*((284+n)/365));
            deltaETValue = true;
            deltaOutputTV.setText("delta:" + delta);
            deltaET.setText(String.valueOf(delta));
        }else{
            deltaOutputTV.setText("delta:" + " - ");
        }
    }

    void n(){
        if (nETValue){
            int n = Integer.parseInt(nETValueInput);
            nOutputTV.setText("n:" + n);
        }else if(deltaETValue){
            double delta = Integer.parseInt(deltaETValueInput);
            int n = (int)((((Math.asin(delta/23.45))/360)*365)-284);
            if (n < 0){
                n = 360 + n;
            }
            nETValue = true;
            nOutputTV.setText("n:" + n);
        }else{
            nOutputTV.setText("n:" + " - ");
        }
    }

    void thetaz() {
        if (thetazETValue) {
            double thetaz = Integer.parseInt(thetazETValueInput);
            thetazOutputTV.setText("theta Z:" + thetaz);
        }else{
            thetazOutputTV.setText("theta Z:" + " - ");
        }
    }

    void phi() {
        if (phiETValue) {
            double phi = Integer.parseInt(phiETValueInput);
            phiOutputTV.setText("phi:" + phi);
        }else{
            phiOutputTV.setText("phi:" + " - ");
        }
    }

    void G() {
        if (gETValue) {
            double G = Integer.parseInt(gETValueInput);
            gOutputTV.setText("G:" + G);
        }else{
            gOutputTV.setText("G:" + " - ");
        }
    }

    void Gg() {
        if (ggETValue) {
            double Gg = Integer.parseInt(ggETValueInput);
            ggOutputTV.setText("Gg:" + Gg);
        }else{
            ggOutputTV.setText("Gg:" + " - ");
        }
    }

    void Gdir() {
        if (gdirETValue) {
            double Gdir = Integer.parseInt(gdirETValueInput);
            gdirOutputTV.setText("Gdir:" + Gdir);
        }else{
            gdirOutputTV.setText("Gdir:" + " - ");
        }
    }

    void Gdif() {
        if (gdifETValue) {
            double Gdif = Integer.parseInt(gdifETValueInput);
            gdifOutputTV.setText("Gdif:" + Gdif);
        }else{
            gdifOutputTV.setText("Gdif:" + " - ");
        }
    }

    void H_I() {
        if (hiETValue) {
            double H_I = Integer.parseInt(hiETValueInput);
            hiOutputTV.setText("H_I:" + H_I);
        }else{
            hiOutputTV.setText("H_I:" + " - ");
        }
    }

    void beta() {
        if (betaETValue) {
            double beta = Integer.parseInt(betaETValueInput);
            betaOutputTV.setText("beta:" + beta);
        }else{
            betaOutputTV.setText("beta:" + " - ");
        }
    }

    void gammaS() {
        if (gammasETValue) {
            double gammaS = Integer.parseInt(gammasETValueInput);
            gammasOutputTV.setText("gammaS:" + gammaS);
        }else{
            gammasOutputTV.setText("gammaS:" + " - ");
        }
    }

    void gamma() {
        if (gammaETValue) {
            double gamma = Integer.parseInt(gammaETValueInput);
            gammaOutputTV.setText("gamma:" + gamma);
        }else{
            gammaOutputTV.setText("gamma:" + " - ");
        }
    }

    void omega() {
        if (omegaETValue) {
            double omega = Integer.parseInt(omegaETValueInput);
            omegaOutputTV.setText("omega:" + omega);
        }else{
            omegaOutputTV.setText("omega:" + " - ");
        }
    }

    void theta() {
        if (thetaETValue) {
            double theta = Integer.parseInt(thetaETValueInput);
            thetaOutputTV.setText("theta:" + theta);
        }else{
            thetaOutputTV.setText("theta:" + " - ");
        }
    }

}

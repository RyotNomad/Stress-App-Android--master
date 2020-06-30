package com.example.stressanxietyapp;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class start_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        MediaPlayer mMediaPlayer = new MediaPlayer();
        mMediaPlayer = MediaPlayer.create(this, R.raw.startup);
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mMediaPlayer.setLooping(false);
        mMediaPlayer.start();


        Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(start_page.this, Time_management_screeen.class));

            }
        });

        Button btn2 = (Button)findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(start_page.this, Relaxation_Main.class));
            }
        });

        Button btn3 = (Button)findViewById(R.id.button1);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(start_page.this, stress_mgmt_main.class));
            }
        });

        Button btn4 = (Button) findViewById(R.id.imageButton3);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(start_page.this, other_services.class));
            }
        });
        Button btn5 = (Button) findViewById(R.id.button11);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(start_page.this, Acknowledgements.class));
            }
        });
        Button btn6 = (Button) findViewById(R.id.button17);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(start_page.this, Disclaimer.class));
            }
        });
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        LinearLayout layout = findViewById(R.id.linearLayout2);
// Gets the layout params that will allow you to resize the layout
        ViewGroup.LayoutParams params = layout.getLayoutParams();
// Changes the height and width to the specified *pixels*
        params.height = height;
        params.width = width;
        layout.setLayoutParams(params);
        LinearLayout layout2 = findViewById(R.id.HorizLinLayout);
// Gets the layout params that will allow you to resize the layout
        ViewGroup.LayoutParams params2 = layout.getLayoutParams();
// Changes the height and width to the specified *pixels*
        params2.height = height ;
        params2.width = width ;
        layout2.setLayoutParams(params2);


    }
    public void onBackPressed() {

    }
    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
    public void easter_egg(){
        showMessage("Acknowledgements","Acknowledgements/References\n" +
                "The Revitalise Your Mind App was created for the Office of Student Success by Ms Bilqees Mahomed\n" +
                "The App was programmed by Farhaan Mithagare\n" +
                "Icons made by Freepik from www.flaticon.com\n" +
                "Icons made by Icons8 from https://icons8.com\n" +
                "\n" +
                "American Psychiatric Association, (2013). Diagnostic and Statistial Manual of Mental Disorders\t\t\t (5th ed.). Washington, DC.\n" +
                "Barlow, D., H, Durand, V. M., du Plessis, L. M., & Visser, C. (2017). Abnormal psychology: an \tintegrative approach (1st South African Ed.). Pearson Education Inc.\n" +
                "Carrington, P., Collings, J. G., Benson, H., Robinson, H., Wood, L. W., Lehrer, P. M., ... & Cole, J. W. \t(1980). The use of meditation--relaxation techniques for the management of stress in a working \tpopulation. Journal of occupational medicine: official publication of the Industrial Medical \tAssociation, 22(4), 221-231.\n" +
                "Dendato, K. M., & Diener, D. (1986). Effectiveness of cognitive/relaxation therapy and study-skills \ttraining in reducing self-reported anxiety and improving the academic performance of test-anxious \tstudents. Journal of Counseling Psychology, 33(2), 131.\n" +
                "Dyrbye, L. N., Thomas, M. R., Massie, F. S., Power, D. V., Eacker, A., Harper, W., ... & Sloan, J. A. \t(2008). Burnout and suicidal ideation among US medical students. Annals of internal medicine, \t149(5), 334-341.\n" +
                "Eppley, K. R., Abrams, A. I., & Shear, J. (1989). Differential effects of relaxation techniques on trait \tanxiety: a meta‐analysis. Journal of clinical psychology, 45(6), 957-974.\n" +
                "Forbus, P., Newbold, J. J., & Mehta, S. S. (2011). A study of non-traditional and traditional students in \tterms of their time management behaviors, stress factors, and coping strategies. Academy of \tEducational Leadership Journal, 15, 109. Retrieved from \thttps://search.proquest.com/openview/408cf194bf6c04fadf8c1a4517b83db4/1?pq-\torigsite=gscholar&cbl=38741\n" +
                "Guthrie, E., Black, D., Bagalkote, H., Shaw, C., Campbell, M., & Creed, F. (1998). Psychological stress \tand burnout in medical students: a five-year prospective longitudinal study. Journal of the Royal \tSociety of Medicine, 91(5), 237-243.\n" +
                "Hiemstra, R. (2001). Uses and benefits of journal writing. New directions for adult and continuing \teducation, 2001(90), 19.\n" +
                "Kachgal, M. M., Hansen, L. S., & Nutter, K. J. (2001). Academic procrastination prevention/intervention: \tStrategies and recommendations. Journal of Developmental Education, 25(1), 14. Retrieved from \thttps://search.proquest.com/openview/2162f67a685051ae284bb700ae6fb37f/1?pq-\torigsite=gscholar&cbl=47765\n" +
                "Larson, H. A., El Ramahi, M. K., Conn, S. R., Estes, L. A., & Ghibellini, A. B. (2010). Reducing Test \tAnxiety among Third Grade Students through the Implementation of Relaxation Techniques. \tJournal of School Counseling, 8(19), n19.\n" +
                "Maslach, C., Schaufeli, W. B., & Leiter, M. P. (2001). Job burnout. Annual review of psychology, 52(1), \t397-422.\n" +
                "Maslach, C., Jackson, S. E., Leiter, M. P., Schaufeli, W. B., & Schwab, R. L. (1986). Maslach burnout \tinventory (Vol. 21, pp. 3463-3464). Palo Alto, CA: \tConsulting psychologists press.\t\n" +
                "Maslach, C., & Leiter, M. P. (2016). Burnout. In Stress: Concepts, Cognition, Emotion, and \tBehavior (pp. 351-357). Academic Press. Retrieved from \thttps://www.sciencedirect.com/science/article/pii/B9780128009512000443\n" +
                "Myers, S. B., Sweeney, A. C., Popick, V., Wesley, K., Bordfeld, A., & Fingerhut, R. (2012). Self-care \tpractices and perceived stress levels among psychology graduate students. Training and \tEducation in Professional Psychology, 6(1), 55. Retrieved from \thttp://dx.doi.org/10.1037/a0026534\n" +
                "Payne, R. A. (2005). Relaxation techniques: A Practical Handbook for the Health Professional. Churchill \tLivingstone: Elsevier.\n" +
                "Schaufeli, W. B., Martinez, I. M., Pinto, A. M., Salanova, M., & Bakker, A. B. (2002). Burnout and \tengagement in university students: A cross-national study. Journal of cross-cultural psychology, \t33(5), 464-481.\n" +
                "Sulea, C., Van Beek, I., Sarbescu, P., Virga, D., & Schaufeli, W. B. (2015). Engagement, boredom, and \tburnout among students: Basic need satisfaction matters more than personality traits. Learning \tand Individual Differences, 42, 132-138.\n" +
                "Tobias, S. (1979). Anxiety research in educational psychology. Journal of Educational Psychology, 71(5), \t573.\n" +
                "Ullrich, P. M., & Lutgendorf, S. K. (2002). Journaling about stressful events: Effects of cognitive \t\tprocessing and emotional expression. Annals of Behavioral Medicine, 24(3), 244-250.\n" +
                "Weiten, W. (2016). Psychology: Themes and Variations (2nd South African Ed.). USA: Cengage Learning.\n");
    }


}

package com.example.stressanxietyapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class other_services extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_services);


        ImageButton button1 = (ImageButton) findViewById(R.id.imagebutton42);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage("Wits Crisis Student Line","Call: 0800 111 331");
            }
        });

        ImageButton button2 = (ImageButton) findViewById(R.id.imageView43);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Tel: 0117172565/ 0117172008\n" +
                        "Email: studentsupport.health@wits.ac.za\n" +
                        "Website:\n" + "http://www.wits.ac.za/health/faculty-services/office-of-student-support";

                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL);

                Spanned myMessage = Html.fromHtml(message);

                showMessage3("Office Student Success", s);
            }
        });

        ImageButton button3 = (ImageButton) findViewById(R.id.imageView44);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Tel: 011 717 9140/32\n" +
                        "Email: info.ccdu@wits.ac.za\n" +
                        "\n" +
                        "Website: https://www.wits.ac.za/ccdu/";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL);
                showMessage3("Couneslling and Careers Development Unit",s);

            }
        });

        ImageButton button4 = (ImageButton) findViewById(R.id.imageView45);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Tel: 011 234 4837\n" +                    " Website:\n " +
                        " http://www.sadag.org \n ";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL);
                showMessage3("The South African Depression and Anxiety Group",s);
            }
        });

        ImageButton button5 = (ImageButton) findViewById(R.id.imageButton2);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Ms Paballo Lepota\n" +
                        "Administrative Officer \n" +
                        "Tel: 011 717-4513\n" +
                        "paballo.lepota@wits.ac.za";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL);
                showMessage3("Emthonjeni Centre",s);
            }
        });

        ImageButton button7 = (ImageButton) findViewById(R.id.imageButton13);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message ="Website: https://www.wits.ac.za/students/geo/\n" +
                        "Pulane Zucula, Office Manager\n" +
                        "011 717 9790\n" +
                        "Pulane.Zucula@wits.ac.za \n" +
                        "for information/to report\n" +
                        "info.geo@wits.ac.za ";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL);
                showMessage3("Gender Equity Service",s);
            }
        });

        Button button8 = (Button) findViewById(R.id.textView3);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message ="Website: https://www.wits.ac.za/campus-life/safety-on-campus/\n" +
                        "East Campus: (011) 717 4444 / 6666\n" +
                        "Health Sciences Campus: (011) 717 2222 / 2232\n" +
                        "Education Campus: (011) 717 3340\n" +
                        "Business School: (011) 717 3589\n";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL);
                showMessage3("Wits Protection Services",s);
            }
        });

        ImageButton button9 = (ImageButton) findViewById(R.id.imageButton14);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message ="Website: https://www.wits.ac.za/students/wits-citizenship-and-community-outreach/\n" +
                        "Tel: 011 717 9217 or 011 717 9255\n" +
                        "Lizette.Norris@wits.ac.za or Karuna.Singh@wits.ac.za";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL);
                showMessage3("Wits Citizenship and Community Outreach",s);
            }
        });


        ImageButton button10 = (ImageButton) findViewById(R.id.imageButton15);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Website: https://www.wits.ac.za/lawclinic/\n" +
                        "Tel: +27 (0) 11 717 8562\n" +
                        "Fax: +27 (0) 11 717 8519\n";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL);
                showMessage3("Wits Law Clinic",s);
            }
        });
        ImageButton button11 = (ImageButton) findViewById(R.id.imageButton16);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Website: \n" +
                        "https://www.wits.ac.za/campushealth/\n" +
                        "Tel: 011 717 9111 / 9113";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL);
                showMessage3("Campus Health and Wellness Centre",s);
            }
        });
        ImageButton button12 = (ImageButton) findViewById(R.id.imageButton17);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Website: https://www.wits.ac.za/disability-rights-unit/contact-us/\n";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL);
                showMessage3("Disability Rights Unit",s);
            }
        });
        ImageButton button13 = (ImageButton) findViewById(R.id.imageButton18);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message ="Call: 082 938 45 59/69\n" +
                        "Email: wits.integrity@wits.ac.za";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL);
                showMessage3("Wits Integrity Hotline",s);
            }
        });


        ImageButton button14 = (ImageButton) findViewById(R.id.imageButton19);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message ="Website: https://www.wits.ac.za/students/first-year-experience/\n" +
                        "Tel: 011 717 9234\n" +
                        "Email: Neo.Cindi@wits.ac.za / Mpho.Thahale@wits.ac.za / Nicole.Morris@wits.ac.za ";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL);
                showMessage3("First Year Experience",s);
            }
        });
        Button button15 = (Button) findViewById(R.id.textView6);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Website: https://www.wits.ac.za/students/wits-writing-centre/\n" +
                        "Call (011) 717-4125/36 or Email Kgaogelo.Lekota@wits.ac.za\n";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL);;
                showMessage3("Wits Writing Centre",s);
            }
        });
        ImageButton button16 = (ImageButton) findViewById(R.id.imageButton20);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message ="Website: https://www.wits.ac.za/transformationoffice/contact-us/\n" +
                        "Tel: (011) 717-1462\n" +
                        "Email: Cecilia.Smith@wits.ac.za";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL);
                showMessage3("Transformation Office",s);
            }
        });
        ImageButton button17 = (ImageButton) findViewById(R.id.imageButton21);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message ="https://www.ted.com/talks\n" +
                        "\n" +
                        "https://www.youtube.com/watch?v=yY86_7G2qZQ\n";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL
                );
                showMessage3("TED Talks",s);
            }
        });
        ImageButton button18 = findViewById(R.id.imageButton22);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message ="Campus Housing and Residence Life\n" +
"Tel: (011) 717 9172/9173\n" +
"(011) 717 9174";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL
                );
                showMessage3("Campus Housing and Residence Life",s);
            }
        });
        Button button19 = findViewById(R.id.button14);
        button19 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message ="Email:info.finaid@wits.ac.za\n" +
"Tel: 011 717 1531\n";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL
                );
                showMessage3("The Financial Aid & Scholarships Office\n",s);
            }
        });
        Button button20 = findViewById(R.id.button15);
        button20 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message ="Tel: +27 11 717 1054\n" +
"Email: studysa.international@wits.ac.za\n";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL
                );
                showMessage3("International Students Office\n",s);
            }
        });
        Button button21 = findViewById(R.id.button16);
        button21 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message ="Email: WitsSurgicalSociety@gmail.com\n" +
"Wits Rural Health Club Home\n" +
"Contact us: Masego\n" +
"Email: witsrhc@gmail.com\n" +
"Tel:  0825206873";
                final SpannableString s = new SpannableString(message);
                Linkify.addLinks(s, Linkify.ALL
                );
                showMessage3("Wits Students Surgical Society",s);
            }
        });

    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    public void showMessage3(String title,Spanned Message){
        final AlertDialog d = new AlertDialog.Builder(this)

                .setMessage( Message )
                .setTitle(title)
                .create();

        d.show();
        ((TextView)d.findViewById(android.R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void showMessage2(String title,Spanned Message){
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
    @Override
    public void onBackPressed() {
        startActivity(new Intent(other_services.this, start_page.class));
    }


}

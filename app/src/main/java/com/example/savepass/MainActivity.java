package com.example.savepass;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ClipboardManager;
import android.content.Context;
import android.app.Activity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Button qq_copy;
    private TextView qq_text;
    private Button ps4_copy;
    private TextView ps4_text;
    private Button wifi_copy;
    private TextView wifi_text;
    private Button email_copy;
    private TextView email_text;
    private Button dsteam_copy;
    private TextView dsteam_text;
    private Button zsteam_copy;
    private TextView zsteam_text;
    private Button dadyqq_copy;
    private TextView dadyqq_text;
    private Button ubisoft_copy;
    private TextView ubisoft_text;
    private Button bilibili_copy;
    private TextView bilibili_text;
    private Button zpyemail_copy;
    private TextView zpyemail_text;
    private Button ljhemail_copy;
    private TextView ljhemail_text;
    private Button admin_copy;
    private TextView admin_text;
    private Button mysql_copy;
    private TextView mysql_text;
    private Button admintor_copy;
    private TextView admintor_text;
    private Button zpysteam_copy;
    private TextView zpysteam_text;
    private Button zpyspass_copy;
    private TextView zpyspass_text;
    private Button pan_copy;
    private TextView pan_text;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qq_copy = (Button) findViewById(R.id.qq_copy);
        qq_text = (TextView) findViewById(R.id.qq_text);
        ps4_copy = (Button) findViewById(R.id.ps4_copy);
        ps4_text = (TextView) findViewById(R.id.ps4_text);
        wifi_copy = (Button) findViewById(R.id.wifi_copy);
        wifi_text = (TextView) findViewById(R.id.wifi_text);
        email_copy = (Button) findViewById(R.id.email_copy);
        email_text = (TextView) findViewById(R.id.email_text);
        dsteam_copy = (Button) findViewById(R.id.dsteam_copy);
        dsteam_text = (TextView) findViewById(R.id.dsteam_text);
        zsteam_copy = (Button) findViewById(R.id.zsteam_copy);
        zsteam_text = (TextView) findViewById(R.id.zsteam_text);
        dadyqq_copy = (Button) findViewById(R.id.dadyqq_copy);
        dadyqq_text = (TextView) findViewById(R.id.dadyqq_text);
        ubisoft_copy = (Button) findViewById(R.id.ubisoft_copy);
        ubisoft_text = (TextView) findViewById(R.id.ubisoft_text);
        bilibili_copy = (Button) findViewById(R.id.bilibili_copy);
        bilibili_text = (TextView) findViewById(R.id.bilibili_text);
        zpyemail_copy = (Button) findViewById(R.id.zpyemail_copy);
        zpyemail_text = (TextView) findViewById(R.id.zpyemail_text);
        ljhemail_copy = (Button) findViewById(R.id.ljhemail_copy);
        ljhemail_text = (TextView) findViewById(R.id.ljhemail_text);
        admin_copy = (Button) findViewById(R.id.admin_copy);
        admin_text = (TextView) findViewById(R.id.admin_text);
        mysql_copy = (Button) findViewById(R.id.mysql_copy);
        mysql_text = (TextView) findViewById(R.id.mysql_text);
        admintor_copy = (Button) findViewById(R.id.admintor_copy);
        admintor_text = (TextView) findViewById(R.id.admintor_text);
        zpysteam_copy = (Button) findViewById(R.id.zpysteam_copy);
        zpysteam_text = (TextView) findViewById(R.id.zpysteam_text);
        zpyspass_copy = (Button) findViewById(R.id.zpyspass_copy);
        zpyspass_text = (TextView) findViewById(R.id.zpyspass_text);
        pan_copy = (Button) findViewById(R.id.pan_copy);
        pan_text = (TextView) findViewById(R.id.pan_text);

        qq_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(qq_text.getText());
                qq_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        qq_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        ps4_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(ps4_text.getText());
                ps4_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        ps4_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        wifi_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(wifi_text.getText());
                wifi_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        wifi_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        email_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(email_text.getText());
                email_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        email_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        dsteam_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(dsteam_text.getText());
                dsteam_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        dsteam_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        zsteam_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(zsteam_text.getText());
                zsteam_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        zsteam_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        dadyqq_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(dadyqq_text.getText());
                dadyqq_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        dadyqq_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        bilibili_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(bilibili_text.getText());
                bilibili_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        bilibili_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        ubisoft_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(ubisoft_text.getText());
                ubisoft_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        ubisoft_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        zpyemail_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(zpyemail_text.getText());
                zpyemail_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        zpyemail_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        ljhemail_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(ljhemail_text.getText());
                ljhemail_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        ljhemail_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        admin_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(admin_text.getText());
                admin_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        admin_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        mysql_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(mysql_text.getText());
                mysql_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        mysql_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        admintor_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(admintor_text.getText());
                admintor_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        admintor_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        zpysteam_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(zpysteam_text.getText());
                zpysteam_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        zpysteam_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        zpyspass_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(zpyspass_text.getText());
                zpyspass_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        zpyspass_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

        pan_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(pan_text.getText());
                pan_copy.setText ("COPY成功");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        pan_copy.setText ("COPY");
                    }
                };
                Timer timer = new Timer();
                timer.schedule(task, 2000);
            }

        });

    }

}
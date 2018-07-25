package sg.edu.rp.c346.contactslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewContacts;
    ArrayList<Contacts>contactsArrayList;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewContacts = findViewById(R.id.listViewContacts);

            contactsArrayList = new ArrayList<>();
            contactsArrayList.add(new Contacts("Mary", 65, 65442334));
            contactsArrayList.add(new Contacts("Ken", 65, 97442437));

            customAdapter = new CustomAdapter(this, R.layout.contacts_item, contactsArrayList);
            listViewContacts.setAdapter(customAdapter);

    }
}

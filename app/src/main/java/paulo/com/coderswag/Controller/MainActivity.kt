package paulo.com.coderswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import paulo.com.coderswag.Model.Category
import paulo.com.coderswag.R
import paulo.com.coderswag.Services.DataService
import paulo.com.coderswag.adapters.CategoryAdapter

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter

    }
}

package paulo.com.coderswag.Controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import paulo.com.coderswag.R
import paulo.com.coderswag.Services.DataService
import paulo.com.coderswag.Utilities.EXTRA_CATEGORY
import paulo.com.coderswag.adapters.CategoryRecycleAdapter

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) {category ->
            val productItent = Intent(this, ProductsActivity::class.java)
            productItent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productItent)
        }

        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)



    }
}

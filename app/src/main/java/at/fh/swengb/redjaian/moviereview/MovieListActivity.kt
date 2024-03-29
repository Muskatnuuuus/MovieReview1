package at.fh.swengb.redjaian.moviereview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_movie_list.*

class MovieListActivity : AppCompatActivity() {
    companion object {
        val EXTRA_MOVIE_ID = "MOVIE_ID_EXTRA"
        val ADD_OR_EDIT_REVIEW_REQUEST = 1
    }

    val movieAdapter = MovieAdapter() {
        val intent = Intent(this, MovieDetailActivity::class.java)
        intent.putExtra(EXTRA_MOVIE_ID, it.id)
        startActivityForResult(intent, ADD_OR_EDIT_REVIEW_REQUEST)
        Toast.makeText(this, "Details for the Movie: ${it.title}", Toast.LENGTH_LONG).show()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        movieAdapter.updateList(MovieRepository.moviesList())
        movie_recycler_view.layoutManager = LinearLayoutManager(this)
        movie_recycler_view.adapter = movieAdapter
    }
}

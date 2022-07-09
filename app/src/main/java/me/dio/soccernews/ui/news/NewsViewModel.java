package me.dio.soccernews.ui.news;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel{

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover Mock de Noticias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviaria tem desfalque importante",""));
        news.add(new News("Ferrinha jogo sabado",""));
        news.add(new News( "Copa do Mundo Feminina esta terminando",""));

        this.news.setValue(news);

    }

    public MutableLiveData<List<News>> getNews() {
        return this.news;
    }
}
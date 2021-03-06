package abrizzz.monews.model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import abrizzz.monews.utils.DateCompare;


/**
 * Created by brizzz on 4/29/16.
 */
public class NewsItems {
    private static NewsItems singleton = null;
    private List<NewsItem> lexpressItems, defiItems, ionItems, teleplusItems, cinqplusItems, mauricienItems;

    private NewsItems()
    {
        lexpressItems = new ArrayList<NewsItem>();
        defiItems = new ArrayList<NewsItem>();
        ionItems = new ArrayList<NewsItem>();
        teleplusItems = new ArrayList<NewsItem>();
        cinqplusItems = new ArrayList<NewsItem>();
        mauricienItems = new ArrayList<NewsItem>();
    }

    public static NewsItems getSingletonInstance()
    {
        if(singleton == null)
        {
            singleton = new NewsItems();
        }
        return singleton;
    }

    //Retungs a list of all NewsItem sorted by publish date
    public List<NewsItem> getAllItemsAsList()
    {
        List<NewsItem> l = new ArrayList<NewsItem>();
        l.addAll(defiItems);
        l.addAll(ionItems);
        l.addAll(teleplusItems);
        l.addAll(mauricienItems);
        l.addAll(cinqplusItems);
        l.addAll(lexpressItems);
        Collections.sort(l,new DateCompare());
        return l;
    }

    public void clearAllList(){
        clearDefiItems();
        clearLexpressItems();
        clearIonItems();
        clearTeleplusItems();
        clearCinqplusItems();
        clearMauricienItems();
    }
    public void addLexpressList(Collection<NewsItem> l){
        lexpressItems.addAll(l);
    }
    public void clearLexpressItems()
    {
        lexpressItems.clear();
    }
    public List<NewsItem> getLexpressItemsAsList(){ return this.lexpressItems; }

    public void addDefiList(Collection<NewsItem> l){
        defiItems.addAll(l);
    }
    public void clearDefiItems()
    {
        defiItems.clear();
    }
    public List<NewsItem> getDefiItemsAsList(){ return this.defiItems; }

    public void addIonList(Collection<NewsItem> l){
        ionItems.addAll(l);
    }
    public void clearIonItems()
    {
        ionItems.clear();
    }
    public List<NewsItem> getIonItemsAsList(){ return this.ionItems; }

    public void addTeleplusList(Collection<NewsItem> l){
        teleplusItems.addAll(l);
    }
    public void clearTeleplusItems()
    {
        teleplusItems.clear();
    }
    public List<NewsItem> getTeleplusItemsAsList(){ return this.teleplusItems; }

    public void addCinqplusList(Collection<NewsItem> l){
        cinqplusItems.addAll(l);
    }
    public void clearCinqplusItems()
    {
        cinqplusItems.clear();
    }
    public List<NewsItem> getCinqplusItemsAsList(){ return this.cinqplusItems; }

    public void addMauricienList(Collection<NewsItem> l){
        mauricienItems.addAll(l);
    }
    public void clearMauricienItems()
    {
        mauricienItems.clear();
    }
    public List<NewsItem> getMauricienItemsAsList(){ return this.mauricienItems; }
}

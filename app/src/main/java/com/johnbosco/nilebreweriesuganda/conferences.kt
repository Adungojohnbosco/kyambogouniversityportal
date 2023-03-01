package com.johnbosco.nilebreweriesuganda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class conferences : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            val mywebview: WebView = view.findViewById(R.id.pe)
            mywebview.webViewClient = object : WebViewClient() {
                override fun shouldOverrideUrlLoading(
                    view: WebView,
                    url: String
                ): Boolean {
                    view.loadUrl(url)
                    return true
                }
            }
            mywebview.loadUrl("https://kyu.ac.ug/conferences-2/")
            mywebview.settings.javaScriptEnabled
            mywebview.settings.allowContentAccess = true
            mywebview.settings.useWideViewPort = true
            mywebview.settings.domStorageEnabled = true
        }
        return inflater.inflate(R.layout.fragment_conferences, container, false)
    }
}
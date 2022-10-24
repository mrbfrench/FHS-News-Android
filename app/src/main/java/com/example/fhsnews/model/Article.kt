package com.example.fhsnews.model

import androidx.annotation.DrawableRes
import java.sql.Date

// Data for a card on the news scroller, such as weather, a piece of news, an announcement or a reminder of an upcoming activity
// (This is the data that goes into the adapter)

data class Article(
    val isWeather: Boolean, // If true, this card will be the weather card and all other arguments will be ignored TODO: Change to generic type (0 for regular article, 1 for weather, 2 for red/silver, etc.)
    @DrawableRes val articleThumbnail: Int, // Image for the article, will be scaled and cropped
    val postedTime: Date, // UNIX time of when the article was posted
    val timeUntil: Int = 0, // If applicable, UNIX time of when the associated activity will happen (If specified, the timestamp will show how long until that activity happens i.e. "In 4 days" instead of "6 hours ago")
    val topperText: String, // Activity the card is associated with, such as "Fishers Football" or "FHS Percussion"
    @DrawableRes val topperIcon: Int, // Emblem for the topper activity
    val author: String, // Who wrote the article (Will be skipped if blank)
    val headline: String, // Headline for the article
    val subtitle: String, // Subtitle displayed below the headline
    val articlePreview: String,
    val text: String // Contents of the article TODO: Change to a different text type that can embed images, videos, urls
)

// Arguments may be freely added (or removed if we don't end up using them)
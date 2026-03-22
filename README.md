# Movies App

A native Android application built with Java that allows users to discover movies, view detailed information, watch trailers, read reviews, and save their favorite titles for quick access.

## 🚀 Features

* **Browse Movies:** Explore a catalog of top-rated movies with an infinite scrolling implementation for seamless pagination.
* **Detailed Information:** View comprehensive movie details, including the official poster, release year, description, and dynamic rating indicators. 
* **Media & Trailers:** Access and launch movie trailers directly from the details screen. 
* **User Reviews:** Read audience reviews featuring color-coded sentiment representation (Positive, Neutral, Negative). 
* **Favorites Collection:** Save and manage favorite movies locally using a dedicated offline-accessible screen.

| Main Screen | Movie Details | Favourite Movies |
| :---: | :---: | :---: |
| <img src="https://github.com/user-attachments/assets/1ecdfd67-0d84-4cdb-934e-dcbe45ab18fc" width="300" /> | <img src="https://github.com/user-attachments/assets/e81e1178-54bb-4e01-bf4c-3cb150fa0d16" width="300" /> | <img src="https://github.com/user-attachments/assets/a65ee643-f099-4f2d-8296-286f203a4adf" width="300" /> |



## 🛠 Tech Stack & Architecture

This project is built utilizing modern Android development standards and robust libraries:

* **Language:** Java
* **Architecture:** MVVM (Model-View-ViewModel) to ensure a clean separation of concerns and lifecycle-aware UI data management.
* **Network Operations:** [Retrofit 2](https://square.github.io/retrofit/) with Gson converter for parsing REST API responses. 
* **Asynchronous Programming:** [RxJava 3](https://github.com/ReactiveX/RxJava) & RxAndroid (`Single`, `Completable`, `CompositeDisposable`) for handling multi-threading, database queries, and network requests. 
* **Local Database:** [Room Persistence Library](https://developer.android.com/training/data-storage/room) for caching favorite movies. 
* **Image Loading:** [Glide](https://github.com/bumptech/glide) for smooth and efficient asynchronous image rendering. 
* **UI Components:** `RecyclerView`, `GridLayoutManager`, and support for modern Edge-to-Edge window insets. 

## ⚙️ Setup and Configuration

This app fetches data using the [Poiskkino API](https://api.poiskkino.dev/v1.4/).To build and run the project locally, you will need to provide your own API key. 

1. Obtain an API key from the service provider.
2. The project relies on a `BuildConfig` field for secure API key injection. You need to configure your `build.gradle` or `local.properties` to generate this field:
   
   ```groovy
   // Example configuration in build.gradle
   buildConfigField "String", "API_KEY_KP", "\"YOUR_API_KEY_HERE\""

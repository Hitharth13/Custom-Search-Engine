# 🔍 Custom Search Engine

A clean and modern web search application built with Spring Boot and Google Custom Search API. Features site-specific filtering for Reddit, Quora, and Stack Overflow.

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-brightgreen)
![License](https://img.shields.io/badge/License-MIT-blue)

## ✨ Features

- 🔎 **Google Custom Search Integration** - Powered by Google's search API
- 🎯 **Site Filters** - Search specifically on Reddit, Quora, Stack Overflow, or all at once
- 📱 **Fully Responsive** - Works seamlessly on mobile, tablet, and desktop
- 🎨 **Clean UI** - Google-inspired minimal design
- ⚡ **Fast & Lightweight** - Built with Spring Boot
- 🔒 **Secure** - Environment-based API key management

## 🚀 Demo

[Live Demo]([https://your-app-name.onrender.com](https://custom-search-engine-4okx.onrender.com/)) 

## 📸 Screenshots

### Desktop View
<img width="1915" height="1023" alt="image" src="https://github.com/user-attachments/assets/074fab19-0894-4022-8aad-e717f6c5313a" />


### Mobile View
<img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/19f62662-772f-4fd1-8a57-11e7ff7f6d61" />


## 🛠️ Tech Stack

- **Backend:** Java 17, Spring Boot 3.2.0
- **Frontend:** HTML5, CSS3, Vanilla JavaScript
- **API:** Google Custom Search API
- **Build Tool:** Maven
- **Deployment:** Docker

## 📋 Prerequisites

Before you begin, ensure you have the following installed:

- [Java JDK 17+](https://adoptium.net/)
- [Maven 3.6+](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/downloads)
- Google Custom Search API credentials

## 🔑 Getting API Credentials

1. **Create a Google Cloud Project:**
   - Visit [Google Cloud Console](https://console.cloud.google.com/)
   - Create a new project

2. **Enable Custom Search API:**
   - Go to "APIs & Services" → "Library"
   - Search for "Custom Search API"
   - Click "Enable"

3. **Create API Key:**
   - Go to "APIs & Services" → "Credentials"
   - Click "Create Credentials" → "API Key"
   - Copy your API key

4. **Create Custom Search Engine:**
   - Visit [Programmable Search Engine](https://programmablesearchengine.google.com/)
   - Click "Add" to create new search engine
   - Enter `*` to search the entire web
   - Copy your Search Engine ID

## 💻 Local Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/YOUR_USERNAME/custom-search-engine.git
   cd custom-search-engine
   ```

2. **Set environment variables:**

   **Windows (CMD):**
   ```cmd
   set GOOGLE_SEARCH_API_KEY=your_api_key_here
   set GOOGLE_SEARCH_CX_ID=your_search_engine_id_here
   ```

   **Linux/Mac:**
   ```bash
   export GOOGLE_SEARCH_API_KEY=your_api_key_here
   export GOOGLE_SEARCH_CX_ID=your_search_engine_id_here
   ```

   **Or create a `.env` file** (don't commit this):
   ```
   GOOGLE_SEARCH_API_KEY=your_api_key_here
   GOOGLE_SEARCH_CX_ID=your_search_engine_id_here
   ```

3. **Build the project:**
   ```bash
   mvn clean package
   ```

4. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

5. **Open your browser:**
   ```
   http://localhost:8080
   ```

## 🐳 Docker Deployment

1. **Build Docker image:**
   ```bash
   docker build -t custom-search-engine .
   ```

2. **Run container:**
   ```bash
   docker run -p 8080:8080 \
     -e GOOGLE_SEARCH_API_KEY=your_api_key \
     -e GOOGLE_SEARCH_CX_ID=your_cx_id \
     custom-search-engine
   ```

## 🌐 Deploy to Render.com (Free)

1. **Fork this repository**

2. **Sign up at [Render.com](https://render.com)**

3. **Create New Web Service:**
   - Connect your GitHub account
   - Select this repository
   - Choose "Docker" environment
   - Select "Free" plan

4. **Add Environment Variables:**
   - `GOOGLE_SEARCH_API_KEY` = your API key
   - `GOOGLE_SEARCH_CX_ID` = your search engine ID

5. **Click "Create Web Service"**

6. **Wait for deployment** (5-10 minutes)

Your app will be live at: `https://your-app-name.onrender.com`

## 📁 Project Structure

```
custom-search-engine/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/search/
│   │   │       └── App.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── index.html
│   │       └── application.properties
│   └── test/
├── .gitignore
├── Dockerfile
├── pom.xml
├── render.yaml
└── README.md
```

## 🎯 Usage

1. **Basic Search:**
   - Type your query in the search box
   - Click "Search" or press Enter
   - Browse through results

2. **Filtered Search:**
   - Select site filters (Reddit, Quora, Stack Overflow)
   - You can select one or multiple sites
   - The search will only show results from selected sites

## ⚙️ Configuration

### Application Properties

Edit `src/main/resources/application.properties`:

```properties
server.port=8080
spring.application.name=google-search-app
```

### API Rate Limits

- **Free Tier:** 100 queries per day
- **Paid Tier:** 10,000 queries per day ($5 per 1,000 queries)

Monitor usage in [Google Cloud Console](https://console.cloud.google.com/)

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- [Google Custom Search API](https://developers.google.com/custom-search)
- [Spring Boot](https://spring.io/projects/spring-boot)
- Inspired by Google's clean search interface

## 📧 Contact
Hitharth - hitharth13@gmail.com

Project Link: [https://github.com/Hitharth13/Custom-Search-Engine](https://github.com/Hitharth13/Custom-Search-Engine)

## 🐛 Known Issues

- Free tier on Render.com sleeps after 15 minutes of inactivity
- First request after sleep takes ~30 seconds to wake up
- Consider upgrading to paid tier for production use

## 🔮 Future Enhancements

- [ ] Add more site filters (GitHub, Medium, etc.)
- [ ] Dark mode toggle
- [ ] Search history
- [ ] Export results to CSV
- [ ] Advanced search operators
- [ ] Image search support

---

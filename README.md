# Java Spring REST API

## 📋 Proje Hakkında

Bu proje, Java Spring Framework kullanılarak geliştirilmiş modern bir REST API uygulamasıdır. Spring Boot'un güçlü özelliklerini kullanarak, ölçeklenebilir ve sürdürülebilir bir backend servisi sunmayı amaçlamaktadır. RESTful API prensiplerine uygun olarak tasarlanmış ve modern web uygulamaları için güvenilir bir backend çözümü sağlar.

## ✨ Özellikler

### 🔧 Temel Özellikler
- **RESTful API**: HTTP standartlarına uygun REST endpoint'leri
- **CRUD İşlemleri**: Create, Read, Update, Delete operasyonları
- **Veritabanı Entegrasyonu**: JPA/Hibernate ile ORM desteği
- **Güvenlik**: Spring Security ile kimlik doğrulama ve yetkilendirme
- **Validasyon**: Bean Validation ile veri doğrulama
- **Dokümantasyon**: Swagger/OpenAPI ile API dokümantasyonu

### 🛡️ Güvenlik ve Yetkilendirme
- **JWT Token**: JSON Web Token tabanlı kimlik doğrulama
- **Spring Security**: Güvenlik katmanı ve yetkilendirme
- **Password Encoding**: BCrypt ile şifre hashleme
- **CORS Yapılandırması**: Cross-origin resource sharing desteği
- **Rate Limiting**: API istek sınırlama

### 📊 Veri Yönetimi
- **JPA/Hibernate**: Object-Relational Mapping
- **Repository Pattern**: Veri erişim katmanı
- **Transaction Management**: İşlem yönetimi
- **Database Migration**: Flyway veya Liquibase ile veritabanı migrasyonu
- **Connection Pooling**: HikariCP ile bağlantı havuzu

### 🔍 Monitoring ve Logging
- **Actuator**: Uygulama sağlığı ve metrikler
- **Logging**: SLF4J ve Logback ile loglama
- **Health Checks**: Uygulama durumu kontrolü
- **Metrics**: Prometheus metrikleri
- **Tracing**: Distributed tracing desteği

### 🧪 Test ve Kalite
- **Unit Testing**: JUnit 5 ile birim testler
- **Integration Testing**: Spring Boot Test ile entegrasyon testleri
- **Mock Testing**: Mockito ile mock testler
- **Code Coverage**: JaCoCo ile kod kapsama raporu
- **Static Analysis**: SonarQube ile kod kalitesi analizi

## 🛠️ Teknoloji Stack'i

### Backend Framework
- **Spring Boot 3.x**: Ana framework
- **Spring Web**: REST API desteği
- **Spring Data JPA**: Veritabanı erişimi
- **Spring Security**: Güvenlik katmanı
- **Spring Validation**: Veri doğrulama

### Veritabanı ve ORM
- **Hibernate**: JPA implementasyonu
- **H2 Database**: Geliştirme veritabanı
- **PostgreSQL/MySQL**: Prodüksiyon veritabanı
- **HikariCP**: Bağlantı havuzu

### Güvenlik
- **Spring Security**: Güvenlik framework'ü
- **JWT**: JSON Web Token
- **BCrypt**: Şifre hashleme
- **CORS**: Cross-origin resource sharing

### Geliştirme Araçları
- **Maven**: Bağımlılık yönetimi
- **Lombok**: Boilerplate kod azaltma
- **MapStruct**: Object mapping
- **Swagger/OpenAPI**: API dokümantasyonu

### Test Araçları
- **JUnit 5**: Test framework'ü
- **Mockito**: Mock kütüphanesi
- **TestContainers**: Container tabanlı testler
- **JaCoCo**: Kod kapsama analizi

## 🚀 Kurulum

### Gereksinimler
- Java 17 veya üzeri
- Maven 3.6+
- Git
- IDE (IntelliJ IDEA, Eclipse, VS Code)

### Adım 1: Projeyi İndirin
```bash
git clone https://github.com/orhanurullah/java-spring-api.git
cd java-spring-api
```

### Adım 2: Veritabanını Hazırlayın
```bash
# H2 Database (geliştirme için otomatik başlar)
# PostgreSQL için:
sudo -u postgres createdb spring_api_db
```

### Adım 3: Uygulamayı Başlatın
```bash
# Maven ile
mvn spring-boot:run

# Veya JAR dosyası oluşturup çalıştırın
mvn clean package
java -jar target/java-spring-api-1.0.0.jar
```

Uygulama `http://localhost:8080` adresinde çalışmaya başlayacaktır.

## 📁 Proje Yapısı

```
java-spring-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/springapi/
│   │   │       ├── SpringApiApplication.java    # Ana uygulama sınıfı
│   │   │       ├── config/                      # Konfigürasyon sınıfları
│   │   │       │   ├── SecurityConfig.java
│   │   │       │   ├── SwaggerConfig.java
│   │   │       │   └── DatabaseConfig.java
│   │   │       ├── controller/                  # REST Controller'ları
│   │   │       │   ├── UserController.java
│   │   │       │   ├── ProductController.java
│   │   │       │   └── AuthController.java
│   │   │       ├── service/                     # İş mantığı katmanı
│   │   │       │   ├── UserService.java
│   │   │       │   ├── ProductService.java
│   │   │       │   └── AuthService.java
│   │   │       ├── repository/                  # Veri erişim katmanı
│   │   │       │   ├── UserRepository.java
│   │   │       │   └── ProductRepository.java
│   │   │       ├── model/                       # Entity sınıfları
│   │   │       │   ├── User.java
│   │   │       │   └── Product.java
│   │   │       ├── dto/                         # Data Transfer Objects
│   │   │       │   ├── UserDto.java
│   │   │       │   └── ProductDto.java
│   │   │       ├── exception/                   # Özel exception'lar
│   │   │       │   ├── ResourceNotFoundException.java
│   │   │       │   └── GlobalExceptionHandler.java
│   │   │       └── util/                        # Yardımcı sınıflar
│   │   │           ├── JwtUtil.java
│   │   │           └── ResponseUtil.java
│   │   └── resources/
│   │       ├── application.yml                  # Uygulama konfigürasyonu
│   │       ├── application-dev.yml              # Geliştirme konfigürasyonu
│   │       ├── application-prod.yml             # Prodüksiyon konfigürasyonu
│   │       └── db/migration/                    # Veritabanı migrasyon dosyaları
│   └── test/
│       └── java/
│           └── com/example/springapi/
│               ├── controller/                  # Controller testleri
│               ├── service/                     # Service testleri
│               └── repository/                  # Repository testleri
├── pom.xml                                      # Maven bağımlılıkları
├── .gitignore                                   # Git ignore dosyası
└── README.md                                    # Proje dokümantasyonu
```

## 🗄️ Veritabanı Şeması

### Kullanıcılar (Users)
```sql
CREATE TABLE users (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) UNIQUE NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    role VARCHAR(20) DEFAULT 'USER',
    enabled BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```

### Ürünler (Products)
```sql
CREATE TABLE products (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10,2) NOT NULL,
    category VARCHAR(50),
    stock_quantity INT DEFAULT 0,
    created_by BIGINT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (created_by) REFERENCES users(id)
);
```

## 🔌 API Endpoint'leri

### Kimlik Doğrulama
```
POST /api/auth/login          # Kullanıcı girişi
POST /api/auth/register       # Kullanıcı kaydı
POST /api/auth/refresh        # Token yenileme
POST /api/auth/logout         # Çıkış yapma
```

### Kullanıcı Yönetimi
```
GET    /api/users             # Tüm kullanıcıları listele
GET    /api/users/{id}        # Kullanıcı detayı
POST   /api/users             # Yeni kullanıcı oluştur
PUT    /api/users/{id}        # Kullanıcı güncelle
DELETE /api/users/{id}        # Kullanıcı sil
```

### Ürün Yönetimi
```
GET    /api/products          # Tüm ürünleri listele
GET    /api/products/{id}     # Ürün detayı
POST   /api/products          # Yeni ürün oluştur
PUT    /api/products/{id}     # Ürün güncelle
DELETE /api/products/{id}     # Ürün sil
```

### Örnek API Kullanımı

#### Kullanıcı Girişi
```bash
curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{
    "username": "admin",
    "password": "password123"
  }'
```

#### Ürün Listesi
```bash
curl -X GET http://localhost:8080/api/products \
  -H "Authorization: Bearer YOUR_JWT_TOKEN"
```

## 🔧 Konfigürasyon

### application.yml
```yaml
spring:
  application:
    name: java-spring-api
  
  datasource:
    url: jdbc:h2:mem:testdb
    driver-class-name: org.h2.Driver
    username: sa
    password: password
  
  jpa:
    hibernate:
      ddl-auto: create-drop
    show-sql: true
    properties:
      hibernate:
        format_sql: true
  
  h2:
    console:
      enabled: true
      path: /h2-console

server:
  port: 8080

jwt:
  secret: your-secret-key-here
  expiration: 86400000 # 24 saat

logging:
  level:
    com.example.springapi: DEBUG
    org.springframework.security: DEBUG
```

### Güvenlik Konfigürasyonu
```java
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .cors(cors -> cors.configurationSource(corsConfigurationSource()))
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/auth/**").permitAll()
                .requestMatchers("/h2-console/**").permitAll()
                .anyRequest().authenticated()
            )
            .sessionManagement(session -> session
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            )
            .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
        
        return http.build();
    }
}
```

## 🧪 Test

### Birim Testleri
```bash
# Tüm testleri çalıştır
mvn test

# Belirli bir test sınıfını çalıştır
mvn test -Dtest=UserServiceTest

# Test coverage raporu
mvn jacoco:report
```

### Entegrasyon Testleri
```bash
# Entegrasyon testlerini çalıştır
mvn test -Dtest=*IntegrationTest

# TestContainers ile test
mvn test -Dtest=*ContainerTest
```

### API Testleri
```bash
# Postman Collection'ı import edin
# veya curl ile test edin
curl -X GET http://localhost:8080/api/health
```

## 📦 Kullanılan Bağımlılıklar

### Spring Boot Starters
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

### Veritabanı
```xml
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```

### Güvenlik
```xml
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-api</artifactId>
    <version>0.11.5</version>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-impl</artifactId>
    <version>0.11.5</version>
    <scope>runtime</scope>
</dependency>
```

### Geliştirme Araçları
```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <optional>true</optional>
</dependency>
<dependency>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct</artifactId>
    <version>1.5.3.Final</version>
</dependency>
```

## 🚀 Deployment

### Docker ile Deployment
```dockerfile
FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/java-spring-api-1.0.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```

```bash
# Docker image oluştur
docker build -t java-spring-api .

# Container çalıştır
docker run -p 8080:8080 java-spring-api
```

### Kubernetes ile Deployment
```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: java-spring-api
spec:
  replicas: 3
  selector:
    matchLabels:
      app: java-spring-api
  template:
    metadata:
      labels:
        app: java-spring-api
    spec:
      containers:
      - name: java-spring-api
        image: java-spring-api:latest
        ports:
        - containerPort: 8080
        env:
        - name: SPRING_PROFILES_ACTIVE
          value: "prod"
```

### Cloud Deployment
```bash
# Heroku
heroku create java-spring-api
git push heroku main

# AWS Elastic Beanstalk
eb init java-spring-api
eb create production
eb deploy
```

## 📊 Monitoring ve Health Checks

### Actuator Endpoint'leri
```
GET /actuator/health          # Uygulama sağlığı
GET /actuator/info           # Uygulama bilgileri
GET /actuator/metrics        # Metrikler
GET /actuator/env            # Ortam değişkenleri
GET /actuator/loggers        # Logger seviyeleri
```

### Prometheus Metrikleri
```yaml
management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics,prometheus
  metrics:
    export:
      prometheus:
        enabled: true
```

## 🤝 Katkıda Bulunma

1. Bu repository'yi fork edin
2. Yeni bir branch oluşturun (`git checkout -b feature/yeni-ozellik`)
3. Değişikliklerinizi commit edin (`git commit -am 'Yeni özellik eklendi'`)
4. Branch'inizi push edin (`git push origin feature/yeni-ozellik`)
5. Pull Request oluşturun

### Katkı Kuralları
- Java kod standartlarına uyun
- Unit test yazın
- API dokümantasyonunu güncelleyin
- Commit mesajlarını açıklayıcı yazın

## 📄 Lisans

Bu proje MIT lisansı altında lisanslanmıştır. Detaylar için `LICENSE` dosyasına bakın.

## 🆘 Destek

Herhangi bir sorun yaşarsanız:
1. [Issues](https://github.com/orhanurullah/java-spring-api/issues) bölümünde arama yapın
2. Yeni bir issue oluşturun
3. Detaylı hata açıklaması ve adımları ekleyin

## 👨‍💻 Geliştirici

Bu proje [Orhan Urullah](https://github.com/orhanurullah) tarafından geliştirilmiştir.

## 🔄 Güncellemeler

### v1.0.0
- İlk sürüm yayınlandı
- Temel CRUD işlemleri
- JWT kimlik doğrulama
- Spring Security entegrasyonu
- Swagger dokümantasyonu

### Gelecek Özellikler
- [ ] GraphQL desteği
- [ ] WebSocket entegrasyonu
- [ ] Redis cache
- [ ] Elasticsearch entegrasyonu
- [ ] Microservices mimarisi

---

⭐ Bu projeyi beğendiyseniz yıldız vermeyi unutmayın!

## 📞 İletişim

- **GitHub**: [@orhanurullah](https://github.com/orhanurullah)
- **E-posta**: orhanurullah@example.com
- **LinkedIn**: [Orhan Urullah](https://linkedin.com/in/orhanurullah)

---

**Java Spring REST API** - Modern backend çözümü 🚀 

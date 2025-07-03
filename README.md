# UpStreak

UpStreak é uma aplicação completa para gerenciamento de hábitos, composta por um backend robusto em Java com Spring Boot e um frontend mobile moderno desenvolvido com React Native e Expo. O objetivo é proporcionar uma experiência fluida para o usuário criar, acompanhar e manter hábitos diários, com gamificação através de conquistas.

---

## Índice
- [Visão Geral](#visão-geral)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Como Rodar o Projeto](#como-rodar-o-projeto)
  - [Backend](#backend)
  - [Frontend](#frontend)
- [Deploy do Backend](#deploy-do-backend)
- [Estrutura de Diretórios](#estrutura-de-diretórios)
- [Contribuição](#contribuição)

---

## Visão Geral

O UpStreak permite que usuários:
- Cadastrem e gerenciem hábitos diários
- Realizem check-ins e acompanhem streaks
- Ganhem conquistas por metas atingidas
- Personalizem perfil e hábitos
- Visualizem histórico e estatísticas

O sistema é dividido em dois principais módulos:
- **Backend:** API RESTful segura, persistência em banco de dados relacional, autenticação JWT, deploy em nuvem.
- **Frontend:** Aplicativo mobile multiplataforma (Android/iOS/Web) com interface moderna, navegação por abas, integração total com a API.

---

## Funcionalidades

- **Cadastro e autenticação de usuários** (login, registro e logout)
- **Criação, edição e exclusão de hábitos** personalizados
- **Check-in diário** para cada hábito
- **Visualização de streaks** (sequência de dias cumpridos)
- **Sistema de conquistas**: desbloqueie conquistas ao atingir metas específicas
- **Histórico detalhado** de hábitos e check-ins
- **Visualização de estatísticas** de desempenho
- **Personalização de perfil** (nome, foto, e-mail, etc.)
- **Categorias e cores para hábitos**
- **Notificações e feedbacks visuais** (animações, toasts)
- **Interface responsiva e intuitiva**
- **Suporte a múltiplas plataformas** (Android, iOS e Web via Expo)

---

## Tecnologias Utilizadas

### Backend
- **Linguagem:** Java 17
- **Framework:** Spring Boot 3.5
- **ORM:** Spring Data JPA
- **Banco de Dados:** PostgreSQL
- **Segurança:** Spring Security, JWT (JSON Web Token)
- **Build:** Maven Wrapper
- **Deploy:** Docker, Fly.io

Principais dependências:
- `spring-boot-starter-web`, `spring-boot-starter-data-jpa`, `spring-boot-starter-security`, `jjwt`, `lombok`

### Frontend
- **Linguagem:** TypeScript
- **Framework:** React Native (Expo)
- **Navegação:** Expo Router, React Navigation
- **Gerenciamento de estado:** Context API
- **Requisições HTTP:** Axios
- **Animações:** Lottie
- **Outros:** AsyncStorage, react-native-calendars, react-native-toast-message

---

## Como Rodar o Projeto

### Backend

#### Pré-requisitos
- Java 17+
- Maven 3.8+
- PostgreSQL (local ou remoto)

#### Configuração
1. Clone o repositório e acesse a pasta do backend:
   ```bash
   cd Back-end/habits
   ```
2. Configure as variáveis de ambiente do banco de dados (ou edite `src/main/resources/application.properties`):
   ```properties
   spring.datasource.url=jdbc:postgresql://<host>:<port>/<database>
   spring.datasource.username=<usuario>
   spring.datasource.password=<senha>
   ```
   Ou defina as variáveis de ambiente `DB_URL`, `DB_USERNAME`, `DB_PASSWORD`.

#### Executando localmente
- Com Maven Wrapper:
  ```bash
  ./mvnw spring-boot:run
  ```
- Ou gerando o JAR:
  ```bash
  ./mvnw package -DskipTests
  java -jar target/*.jar
  ```
- A API estará disponível em `http://localhost:8080`

#### Docker (opcional)
- Para rodar via Docker:
  ```bash
  docker build -t upstreak-backend .
  docker run -p 8080:8080 --env DB_URL=... --env DB_USERNAME=... --env DB_PASSWORD=... upstreak-backend
  ```

### Frontend

#### Pré-requisitos
- Node.js 18+
- npm 9+
- Expo CLI (global):
  ```bash
  npm install -g expo-cli
  ```
- **Expo Go instalado no seu celular** (disponível na Play Store e App Store)

#### Executando
1. Acesse a pasta do frontend:
   ```bash
   cd Front-end/upStreak
   ```
2. Instale as dependências:
   ```bash
   npm install
   ```
3. Inicie o app:
   ```bash
   npx expo start
   ```
4. Certifique-se de que seu celular e o computador estejam conectados na **mesma rede Wi-Fi**.
5. Abra o app **Expo Go** no seu celular e escaneie o **QR code** gerado no terminal ou na página web aberta pelo comando acima.
6. Siga as instruções do Expo para rodar no emulador Android/iOS ou Expo Go.

> **Obs:** O app espera que a API esteja rodando em produção ou localmente. Ajuste a URL da API nos arquivos de utilitários, se necessário.

---

## Deploy do Backend

O backend é empacotado em uma imagem Docker e publicado na nuvem usando o [Fly.io](https://fly.io/):

1. **Dockerfile** multi-stage para build e execução otimizada.
2. **fly.toml** define a configuração da aplicação, portas, região, recursos e variáveis de ambiente.
3. Deploy realizado com:
   ```bash
   fly launch
   fly deploy
   ```
4. O serviço fica disponível em uma URL pública fornecida pelo Fly.io.

---

## Estrutura de Diretórios

```
UpStreak/
  ├── Back-end/
  │   └── habits/           # Backend Java Spring Boot
  │       ├── src/          # Código-fonte
  │       ├── Dockerfile    # Build Docker
  │       ├── fly.toml      # Configuração Fly.io
  │       └── ...
  └── Front-end/
      └── upStreak/         # Frontend React Native (Expo)
          ├── app/          # Código-fonte
          ├── assets/       # Imagens, animações
          ├── components/   # Componentes reutilizáveis
          └── ...
```

---

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues, pull requests ou sugerir melhorias.

---

**Desenvolvido por Arthur Granito e colaboradores.**

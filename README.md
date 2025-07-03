<<<<<<< HEAD
# UpStreak

UpStreak é uma aplicação completa para gerenciamento de hábitos, composta por um backend robusto em Java com Spring Boot e um frontend mobile moderno desenvolvido com React Native e Expo. O objetivo é proporcionar uma experiência fluida para o usuário criar, acompanhar e manter hábitos diários, com gamificação através de conquistas.

---

## Índice
- [Visão Geral](#visão-geral)
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
4. Siga as instruções do Expo para rodar no emulador Android/iOS ou Expo Go.

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
=======
# 🧠 UpStreak — App de Hábitos com Conquistas

Um aplicativo completo para criação e monitoramento de hábitos, com sistema de **conquistas (achievements)** que motiva o usuário com recompensas por progresso e consistência.  
Desenvolvido em **React Native (Expo Router)** no front-end e **Java (Spring Boot)** no back-end.  
Repositório unificado com as pastas separadas por front e back.

---

## 📁 Estrutura do Projeto
/upstreak <br>
│ <br>
├── backend # API REST em Java com Spring Boot\n
│ ├── src/main/java/...<br>
│ └── ...<br>
│── frontend # Aplicativo mobile em React Native com Expo<br>
│ ├── app/...<br>
│ ├── components/<br>
│ └── ...<br>
│<br>
└── README.md<br>

---

## 🚀 Funcionalidades

### ✅ Funcionalidades principais
- Criação, edição e exclusão de hábitos
- Check-ins diários por hábito
- Acompanhamento de progresso por dia e semana
- Sistema de categorias (ex: Saúde, Leitura, Produtividade)
- Sistema de **conquistas desbloqueáveis**
- Histórico de conquistas
- Autenticação com login e registro
- Proteção de rotas

### 🏆 Conquistas (Achievements)
- Progresso inicial (1º hábito, 1º check-in)
- Consistência (7 dias seguidos, 30 dias, 100 check-ins)
- Tempo de uso (1 semana, 1 mês, 1 ano)
- Categorias (usou 3 categorias, hábitos saudáveis)
- Hábitos específicos (leitura, sono, mindfulness)

---

## 🛠️ Tecnologias Utilizadas

### Front-end (React Native)
- **Expo Router**
- **AsyncStorage** (armazenamento local)
- **React Navigation**
- **Axios**
- **Context API** para autenticação e controle global
- **Shadcn + Tailwind para UI (via web)** (opcional)

### Back-end (Spring Boot)
- **Spring Web**
- **Spring Data JPA**
- **PostgreSQL**
- **Spring Security + JWT**
- **Flyway** (migrações)
- **DTOs, Services, Controllers** bem organizados
- **Verificação automática de conquistas**

---

## ⚙️ Como rodar o projeto

### 📦 Pré-requisitos
- Node.js + npm
- Java 17+
- PostgreSQL
- Expo CLI (`npm install -g expo-cli`)

---

### 🔧 Backend

```bash
cd backend
# Configure o application.properties com seu banco
./mvnw spring-boot:run
```
---
### 📱 Frontend
```bash
cd frontend
npm install
npm start
```
### 🧑‍💻 Autor
Desenvolvido por Arthur Granito<br>
Contato: arthurgranitodev@gmail.com<br>
Linkedin: linkedin.com/in/arthurgranito<br>
>>>>>>> 7988d231367761a10c9ef66d73e34462f24905d3

# 🧠 UpStreak — App de Hábitos com Conquistas

Um aplicativo completo para criação e monitoramento de hábitos, com sistema de **conquistas (achievements)** que motiva o usuário com recompensas por progresso e consistência.  
Desenvolvido em **React Native (Expo Router)** no front-end e **Java (Spring Boot)** no back-end.  
Repositório unificado com as pastas separadas por front e back.

---

## 📁 Estrutura do Projeto
/upstreak
│
├── backend # API REST em Java com Spring Boot
│ ├── src/main/java/...
│ └── ...
│
├── frontend # Aplicativo mobile em React Native com Expo
│ ├── app/...
│ ├── components/
│ └── ...
│
└── README.md

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
Desenvolvido por Arthur Granito
Contato: arthurgranitodev@gmail.com
Linkedin: linkedin.com/in/arthurgranito

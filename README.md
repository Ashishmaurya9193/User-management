# User Service

## What this includes
- Email/password registration and login (session-based)
- Google OAuth2 login (creates an account on first sign-in)
- MySQL persistence (configured in `application.properties`)

## Requirements
- Java 17
- MySQL running locally
- Google OAuth credentials (optional for Google login)

## Quick start
```bash
./mvnw spring-boot:run
```

## Google OAuth setup
Set environment variables before running:
```bash
export GOOGLE_CLIENT_ID="your-client-id"
export GOOGLE_CLIENT_SECRET="your-client-secret"
```

Then visit:
- `http://localhost:8081/login/oauth2/code/google`
- Or start login at `http://localhost:8081/oauth2/authorization/google`

## Auth endpoints
- `POST /auth/register`
- `POST /auth/login`

Example register:
```bash
curl -i -X POST http://localhost:8081/auth/register \
  -H "Content-Type: application/json" \
  -d '{"name":"Alice","email":"alice@example.com","password":"secret123"}'
```

Example login:
```bash
curl -i -X POST http://localhost:8081/auth/login \
  -H "Content-Type: application/json" \
  -d '{"email":"alice@example.com","password":"secret123"}'
```

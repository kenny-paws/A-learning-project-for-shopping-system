鍚庣锛圫pring Boot锛夎繍琛岃鏄?
````markdown
鍚庣锛圫pring Boot锛夎繍琛岃鏄?

鏈」鐩彁渚涗袱绉嶈繍琛屾柟寮忥細鏈湴锛堥渶瑕?Java 21 & Maven锛夋垨浣跨敤 Docker Compose锛堝寘鍚?MySQL锛夛紝骞舵敮鎸佸湪 GitHub Codespaces 涓娇鐢ㄣ€?

鏈湴杩愯锛?

```bash
# 浠庝粨搴撴牴鐩綍鎵ц
mvn -f backend/pom.xml spring-boot:run
```

鏋勫缓锛堣烦杩囨祴璇曚互鑺傜渷鏃堕棿锛夛細

```bash
mvn -f backend/pom.xml -DskipTests package
```

杩愯娴嬭瘯锛?

```bash
mvn -f backend/pom.xml test
# 杩愯鍗曚釜闆嗘垚鐑熼浘娴嬭瘯
mvn -f backend/pom.xml -Dtest=ApplicationSmokeTest test
```

Docker Compose锛堝湪浠撳簱鏍圭洰褰曡繍琛岋紝浼氬惎鍔?MySQL 鍜屽悗绔湇鍔★級锛?

```bash
docker compose up --build
```

- 鍚庣鍦板潃锛?`http://localhost:8080`
- MySQL锛歚localhost:3306`锛屾暟鎹簱 `shopping`锛岀敤鎴?`shop`锛屽瘑鐮?`shop`

GitHub Codespaces锛?
- 浠撳簱鍖呭惈 `.devcontainer/devcontainer.json` 鍜?`docker-compose.yml`锛屾墦寮€ Codespace 鏃朵細鍚姩涓€涓紑鍙戝鍣紙鏈嶅姟鍚?`workspace`锛夛紝骞跺湪 `postCreateCommand` 涓瀯寤哄悗绔€?
- Devcontainer 浣跨敤 Java 21锛堜笌 CI 淇濇寔涓€鑷达級銆?
- 鍦?Codespaces 涓繍琛岀儫闆炬祴璇曪細 `cd backend && mvn -Dtest=ApplicationSmokeTest test`銆?

绀轰緥鎺ュ彛锛?
- `GET /api/products` 鍒楄〃
- `GET /api/products/{id}` 鑾峰彇鍗曚釜
- `POST /api/products` 鏂板
- `PUT /api/products/{id}` 鏇存柊
- `DELETE /api/products/{id}` 鍒犻櫎
````
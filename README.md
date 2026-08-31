# vuln-java-app

> ⚠️ **Intentionally vulnerable — exists solely for security alert testing.**

Designed to trigger **all three** GitHub Advanced Security alert types:

| Alert type      | How it is triggered |
|-----------------|---------------------|
| Dependabot      | log4j-core 2.14.1 (Log4Shell CVE-2021-44228), commons-collections 3.1, jackson-databind 2.9.8 |
| Code scanning   | CodeQL workflow on push (`.github/workflows/codeql.yml`) |
| Secret scanning | Hardcoded fake AWS key pattern in `App.java` |

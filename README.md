# Deploy test
CI/CD 배포 실험용 리포

### API 명세
| Description | Method | URL     | Request Body           | Response Body |
|------------|--------|---------|------------------------|---------------|
| 테스트용       | GET         | /health |                 | String: "잘 실행되었습니다. UP" |
---
### AWS CodeBuild / CodeDeploy

![workflowchart.png](img/aws%20cicd%20flow.png)

---
### Github Actions

![github actions flow.png](img/github%20actions%20flow.png)

- [Demystifying Docker for Spring Boot: Automation with GitHub Actions - Dharshi Balasubramaniyam](https://medium.com/javarevisited/demystifying-docker-for-spring-boot-automation-with-github-actions-716652668d7e)
- [Github Actions과 Docker을 활용한 CI/CD 구축 - 짱J](https://velog.io/@leeeeeyeon/Github-Actions%EA%B3%BC-Docker%EC%9D%84-%ED%99%9C%EC%9A%A9%ED%95%9C-CICD-%EA%B5%AC%EC%B6%95)
- [Github Actions를 이용해 CI 구성하기 (Java, Gradle, Jacoco) - Shef](https://velog.io/@sontulip/github-actions-ci)
- [actions/cache/Java - Gradle - github actions](https://github.com/actions/cache/blob/main/examples.md#java---gradle)
- [Gradle 프로젝트에 JaCoCo 설정하기 - 우아한 기술 블로그 연철](https://techblog.woowahan.com/2661/)
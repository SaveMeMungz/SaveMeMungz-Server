### Git Commit Convention

| 타입 | 상황 |
| --- | --- |
| feat | 새로운 기능 추가 |
| bugfix | 버그 수정 |
| hotfix | 긴급 수정 |
| ci | 지속 통합 |
| cd | 지속 배포 |
| chore | 단순 작업 |
| docs | 문서 추가/수정 |
| style | 코드 포매팅, 세미콜론 누락 등등(코드 변경이 없는 경우) |
| test | 테스트 코드, 리팩토링 테스트 코드 추가 |
| refactor | 코드 리팩토링 |

## docker mysql setting
```python
cd SaveMeMungz-Server
docker pull mysql
docker-compose up
```
## docker db 접속

```python
docker exec -it mungdb bash
mysql -u user -p'1234'
```

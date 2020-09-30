.
├── api
│   ├── api.iml
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── korges
│   │   │   │           └── banksystem
│   │   │   │               └── controller
│   │   │   │                   └── UserController.java
│   │   │   └── resources
│   │   └── test
│   │       └── java
│   └── target
│       ├── classes
│       │   └── com
│       │       └── korges
│       │           └── banksystem
│       │               └── controller
│       │                   └── UserController.class
│       └── generated-sources
│           └── annotations
├── application
│   ├── application.iml
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── korges
│   │   │   │           └── banksystem
│   │   │   │               ├── jpa
│   │   │   │               │   └── adapter
│   │   │   │               │       ├── UserCrudAdapter.java
│   │   │   │               │       ├── UserFacade.java
│   │   │   │               │       └── UserSuspensionAdapter.java
│   │   │   │               └── user
│   │   │   │                   └── mapper
│   │   │   │                       └── UserMapper.java
│   │   │   └── resources
│   │   └── test
│   │       └── java
│   └── target
│       ├── classes
│       │   └── com
│       │       └── korges
│       │           └── banksystem
│       │               ├── config
│       │               │   └── ApplicationConfiguration.class
│       │               └── user
│       │                   ├── UserCrudAdapter.class
│       │                   ├── UserFacade.class
│       │                   └── UserSuspensionAdapter.class
│       └── generated-sources
│           └── annotations
├── bank-system.iml
├── boot
│   ├── boot.iml
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── korges
│   │   │   │           └── banksystem
│   │   │   │               └── BankSystemApplicationLauncher.java
│   │   │   └── resources
│   │   └── test
│   │       └── java
│   └── target
│       ├── classes
│       │   └── com
│       │       └── korges
│       │           └── banksystem
│       │               └── BankSystemApplicationLauncher.class
│       └── generated-sources
│           └── annotations
├── domain
│   ├── domain.iml
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── korges
│   │   │   │           └── banksystem
│   │   │   │               └── user
│   │   │   │                   ├── model
│   │   │   │                   │   ├── Address.java
│   │   │   │                   │   └── User.java
│   │   │   │                   └── port
│   │   │   │                       ├── incoming
│   │   │   │                       │   ├── UserCrud.java
│   │   │   │                       │   └── UserSuspension.java
│   │   │   │                       └── outgoing
│   │   │   │                           └── UserPersistencePort.java
│   │   │   └── resources
│   │   └── test
│   │       └── java
│   └── target
│       ├── classes
│       │   └── com
│       │       └── korges
│       │           └── banksystem
│       │               └── user
│       │                   ├── model
│       │                   │   ├── Address.class
│       │                   │   ├── Email.class
│       │                   │   └── User.class
│       │                   └── port
│       │                       ├── incoming
│       │                       │   ├── UserCrud.class
│       │                       │   └── UserSuspension.class
│       │                       └── outgoing
│       │                           └── UserDatabase.class
│       └── generated-sources
│           └── annotations
├── dto
│   ├── dto.iml
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── korges
│       │   │           └── banksystem
│       │   │               └── user
│       │   │                   ├── UserInputDto.java
│       │   │                   └── UserOutputDto.java
│       │   └── resources
│       └── test
│           └── java
├── infrastructure
│   ├── infrastructure.iml
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── korges
│   │   │   │           └── banksystem
│   │   │   │               └── jpa
│   │   │   │                   ├── adapter
│   │   │   │                   │   └── UserPersistenceJpaAdapter.java
│   │   │   │                   ├── entity
│   │   │   │                   │   └── UserEntity.java
│   │   │   │                   └── repository
│   │   │   │                       └── UserRepository.java
│   │   │   └── resources
│   │   └── test
│   │       └── java
│   └── target
│       ├── classes
│       │   └── com
│       │       └── korges
│       │           └── banksystem
│       │               └── user
│       │                   ├── adapter
│       │                   │   └── UserDatabaseAdapter.class
│       │                   ├── config
│       │                   │   └── SpringDataJpaConfiguration.class
│       │                   ├── entity
│       │                   │   └── UserEntity.class
│       │                   └── repository
│       │                       └── UserRepository.class
│       └── generated-sources
│           └── annotations
└── pom.xml

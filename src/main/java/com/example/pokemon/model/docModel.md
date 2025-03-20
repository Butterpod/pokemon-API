# 📌 Documentation - Annotation JPA et Lombok

## 📍 Annotations de l'Entité

### `@Entity`
Indique que cette classe est une **entité JPA** qui correspond à une **table** en base de données.

(Une entité JPA est une classe Java qui représente une table en base de données dans le cadre de JPA (Java Persistence API).)

### `@Table(name = "pokemon")`
Lie cette entité à la **table `pokemon`** dans PostgreSQL.

### `@Data`
Génère automatiquement **`toString()`, `equals()`, `hashCode()`** et les **getters/setters** (grâce à Lombok).

---

## 📍 Gestion de la Clé Primaire

### `@Id`
Indique que **`id` est la clé primaire**.

### `@GeneratedValue(strategy = GenerationType.IDENTITY)`
PostgreSQL **génère automatiquement l’ID** (auto-incrémenté).

---

## 📍 Colonnes de la Table

### `@Column(name="name")`
Spécifie que cet attribut correspond à la **colonne `name`** dans la base de données.

```java
private String name; // Stocke le nom du Pokémon (ex: Pikachu, Bulbizarre).

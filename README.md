# 📜 The Lands Between Adventure Guide (Elden Ring Information Management System)

A structured, database-driven desktop information management application built using **Java Swing (JDBC)** and **MySQL**. This system serves as a relational framework for tracking RPG player progress, managing custom weapon inventories, cataloging boss entities with localized strategic metadata, and recording transactional challenge histories within a dedicated ledger window.

---

## 🗺️ Phase 1 & 2: Project Proposal & Requirements Analysis

### 1. Problem Statement
Players of large open-world action RPGs like *Elden Ring* face a massive influx of character attributes, complex scaling equations, specialized structural gear sets, and distinct positional boss encounters. Relying on loose paper logs or non-relational spreadsheets makes optimizing builds and tracking high-level accomplishments unorganized. 

This desktop application solves this data management problem by isolating core domain entities into structured MySQL databases. It ensures absolute information integrity via constrained table connections while providing clean, event-driven interfaces for data updates, transactional victory logging, and flexible search tracking.

### 2. Target System Users
* **RPG Enthusiasts / Active Players:** To seamlessly log milestones and preserve a clean inventory setup across multiple operational profiles.
* **Game Analysts / Theorycrafters:** To trace damage metrics, status archetypes, and build strategies across unified, relational entity datasets.

### 3. Core System Processes & Functional Features
* **Character Management Module (Inscribe Oath):** Full CRUD processing designed to create, load, modify, and delete distinct player records mapping numerical stats (Level, Vigor, Mind) and qualitative types.
* **Arsenal Inventory Controller:** Form interfaces enforcing input constraints to control database arrays tracking localized weaponry assets, explicit weight limits, and core damage types.
* **Legendary Bestiary Tracker:** An interactive dictionary containing historical cataloging routes for major boss encounters, indexing weak vulnerability vectors and custom combat notes.
* **Roundtable Hold Gateway (Junction Event Logger):** A specialized transaction-oriented dashboard reading live keys from standalone tables into visual dropdown entries. Clicking the action button logs a live, history-tracked victory instance to the relational table.
* **The Remembrance Ledger (Transaction CRUD Log):** A dedicated history screen showcasing past transactions inside a dynamic `JTable`. Includes structural real-time keyword filtering and secure delete operations governed by explicit confirmation routines.

---

## 🗄️ Phase 3: Database Schema & Data Dictionary

The relational back-end implements a normalized 5-table schema explicitly connecting master profile targets with real-time transactional logs.

### 1. Data Tables Categorization
* **Master Profile Targets:** `users`, `characters`, `bosses`, `weapons`
* **Relational Junction Log:** `boss_conquests` (Links `characters` and `bosses` via dual foreign key mappings enforcing strict cascading data rules).

### 2. SQL Schema Installation Script (Phase 6 Deliverable)
```sql
CREATE DATABASE IF NOT EXISTS eldenring_guide;
USE eldenring_guide;

-- 1. Authentication Table
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(50) NOT NULL
);

-- 2. Characters Profile Table (Master Entity A)
CREATE TABLE characters (
    name VARCHAR(255) PRIMARY KEY,
    level INT NOT NULL,
    build_type VARCHAR(100)

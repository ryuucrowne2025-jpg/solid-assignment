# SOLID Assignment

## Deskripsi
Project ini dibuat untuk memenuhi tugas mata kuliah Desain Perangkat Lunak mengenai penerapan dan perbaikan prinsip SOLID.

Project berisi contoh kode yang melanggar beberapa prinsip SOLID serta hasil refactoring/perbaikannya.

---

# Prinsip SOLID yang Dilanggar

Kode awal melanggar beberapa prinsip SOLID, yaitu:

1. Single Responsibility Principle (SRP)
2. Open/Closed Principle (OCP)
3. Dependency Inversion Principle (DIP)

---

# Struktur Project

## before-refactor
Berisi kode awal yang masih melanggar prinsip SOLID.

Contoh pelanggaran:
- Satu class memiliki banyak tanggung jawab
- Menggunakan banyak if-else untuk metode pembayaran
- Dependency langsung terhadap implementasi konkret

---

## after-refactor
Berisi kode hasil perbaikan/refactoring menggunakan prinsip SOLID.

Perbaikan dilakukan dengan:
- Memisahkan tanggung jawab class
- Menggunakan interface
- Mengurangi dependency langsung
- Menerapkan abstraction

---

# Teknologi
- Java
- Git
- GitHub

---

# Commit History

## Commit 1
Initial code with SOLID violations

Berisi kode awal yang masih melanggar prinsip SOLID.

## Commit 2
Refactor code using SOLID principles

Berisi hasil refactoring dan penerapan prinsip SOLID.

---

# Author
Nama: Fajri Ahmad Siregar  
Mata Kuliah: Desain Perangkat Lunak

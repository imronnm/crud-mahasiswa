# Aplikasi Managemen Mahasiswa
## _Selamat datang di proyek Sistem Manajemen Mahasiswa! Proyek ini dirancang untuk membantu Anda mengelola catatan mahasiswa dengan mudah menggunakan aplikasi Spring Boot yang terhubung ke basis data PostgreSQL._

[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Gambaran Proyek Sistem Manajemen Mahasiswa adalah aplikasi Spring Boot yang memungkinkan Anda melakukan operasi CRUD (Create, Read, Update, Delete) pada catatan mahasiswa. Ini mencakup fitur seperti menambahkan mahasiswa baru, mengambil informasi mahasiswa, memperbarui detail mahasiswa, dan menghapus catatan mahasiswa.

## Fitur
- Membuat catatan mahasiswa baru
- Mengambil semua catatan mahasiswa
- Mengambil catatan mahasiswa berdasarkan ID
- Memperbarui informasi mahasiswa
- Menghapus catatan mahasiswa
- Pertanyaan kustom untuk mencari mahasiswa berdasarkan NIM dan alamat


## Endpoints
GET /students: Mengambil semua catatan mahasiswa
GET /students/{id}: Mengambil catatan mahasiswa berdasarkan ID
POST /students: Membuat catatan mahasiswa baru
PUT /students/{id}: Memperbarui informasi mahasiswa berdasarkan ID
DELETE /students/{id}: Menghapus catatan mahasiswa berdasarkan ID

Pertanyaan Kustom
GET /students/byNim/{nim}: Mengambil mahasiswa berdasarkan NIM
GET /students/byAddress/{address}: Mengambil mahasiswa berdasarkan alamat


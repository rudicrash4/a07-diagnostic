# A07 Diagnostic

Aplikasi diagnostik Phase 0 untuk proyek A07 Game Booster (Samsung Galaxy A07 SM-A075F).

**Status: Tahap 1 (kerangka proyek dan CI).** Belum ada fitur diagnostik, dan belum ada klaim bahwa aplikasi berjalan di perangkat mana pun.

## Prinsip

- Tanpa root, tanpa Shizuku, tanpa ADB.
- Tanpa izin INTERNET dan tanpa pengunggahan data otomatis.
- Data yang tidak tersedia ditampilkan sebagai "Unavailable", bukan nol.
- Bukan pengoptimal performa; tidak mengubah sistem atau game apa pun.

## Build

Build dijalankan oleh GitHub Actions (tab Actions, workflow "Phase 0 Build"). APK debug diunggah sebagai artefak pada run yang berhasil.

## Lisensi

Apache-2.0. Lihat berkas LICENSE.

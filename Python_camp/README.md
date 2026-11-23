# python環境

```sh
# プロジェクト作成
uv init Python_camp

# 仮想環境作成
uv venv

# インストール
uv add <パッケージ名>

# 仮想感環境を使った動かし方
uv run python src/001-work.py

# パッケージ確認
uv pip list

# パッケージuninstall
uv remove <パッケージ名>

# pyproject.tomlでバージョンを変えた時にupgrade
uv sync --upgrade

# pytestの導入
uv add --dev pytest
```

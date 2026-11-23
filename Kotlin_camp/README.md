# Kotlin開発環境

| 項目 | 内容 |
|------|------|
| OS | Windows 11（64bit） |
| IDE | IntelliJ IDEA |
| JDK | JDK 25 |
| ビルドツール | Gradle9.1以上 |
| 言語 | Kotlin（IntelliJ IDEA に同梱） |
| 任意 | Kotlin コマンドラインコンパイラ、Git |

## 1.JDKインストール

> ダウンロード

https://www.oracle.com/jp/java/technologies/downloads/#jdk25-windows

- ダウンロードが完了したら、該当のexeファイルを実行

> 環境変数の設定

- システム環境変数で新しい変数を作成

```txt
JAVA_HOME
C:\Program Files\Java\jdk-25.0.5.0.3
```

- システム環境変数に下記のパスを設定

```sh
%JAVA_HOME%\bin
```

> 確認

``` powerShell
java -version
javac -version
echo $env:JAVA_HOME
```

## 2. IntelliJ IDEA のインストール

> JetBrains Toolbox Appをインストール

https://www.jetbrains.com/ja-jp/toolbox-app/

## 3. IntelliJ IDEA の初期設定

- IntelliJ IDEA を起動し、利用規約に同意
- Kotlin プラグインの確認
  - File > Settings > Plugins でKotlinを検索、有効になっている事を確認

> エンコーディング設定

- File → Settings（Macは IntelliJ IDEA → Settings）→ Editor → File Encodings
- 以下の設定をUTF-8に設定

```txt
Global Encoding
Project Encoding
Default encoding for properties files
```

- Help → Edit Custom VM Options...を開き、下記を追加後に再起動

```txt
-Dfile.encoding=UTF-8
-Dconsole.encoding=UTF-8
```

## 4．Kotlin プロジェクトの作成

| 設定項目 | 推奨値 |
|----------|--------|
| Name | `HelloKotlin` |
| Location | `C:\dev\kotlin` など（日本語・空白を含まないパス） |
| Build system | **Gradle** |
| JDK | C:\Program Files\Java\jdk-25.0.5.0.3 |
| Gradle DSL | **Kotlin** |
| Add sample code | ✅ チェック |

> Gradleバージョン確認

- Alt + F12 でターミナルを開く

```powershell
.\gradlew.bat --version
```

> Gradleエンコーディング設定

- build.gradle.kts に下記を追加
```kts
tasks.withType<JavaExec> {
    jvmArgs("-Dfile.encoding=UTF-8", "-Dstdout.encoding=UTF-8", "-Dstderr.encoding=UTF-8")
}
```

- gradle.propertiesに下記を追加
```properties
org.gradle.jvmargs=-Dfile.encoding=UTF-8
```
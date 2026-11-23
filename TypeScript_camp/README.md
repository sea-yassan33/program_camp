# TypeScript CAMP

## 環境構築

```sh
npm init -y
npm i -D typescript vitest tsx @types/node
npx tsc --init
```

> tsconfig.json

```json
{
  "compilerOptions": {
    "target": "ES2022",
    "module": "NodeNext",
    "moduleResolution": "NodeNext",
    "lib": ["ES2023"],
    "strict": true,
    "noUncheckedIndexedAccess": true,
    "noImplicitOverride": true,
    "noEmit": true,
    "skipLibCheck": true
  },
  "include": ["src"]
}
```

> package.json

```json
{
  "type": "module",
  "scripts": {
    "t": "vitest run",
    "test": "vitest",
    "typecheck": "tsc --noEmit --watch",
    "run": "tsx watch"
  }
}
```

## テスト実行方法

```sh
## 値のみチェック
npm run t -- 001

## 型チェック
npx vitest run 001 --typecheck
```
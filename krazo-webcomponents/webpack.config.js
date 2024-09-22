const path = require('path');

module.exports = {
    entry: '/src/main/webapp/resources/js/litcomponents/filter-display.js', // Replace this with the path to your main JS file
    output: {
        path: path.resolve(__dirname, 'src/main/webapp/resources/dist'),
        filename: 'bundle.js',
        publicPath: '/resources/dist/'
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                exclude: /node_modules/,
                use: {
                    loader: 'babel-loader',
                    options: {
                        presets: ['@babel/preset-env'],
                        plugins: [
                            ['@babel/plugin-proposal-decorators', { "legacy": true }],
                            ['@babel/plugin-proposal-class-properties', { "loose": true }]
                        ]
                    }
                }
            }
        ]
    },
    devServer: {
        static: {
            directory: path.join(__dirname, 'public'),
        },
        compress: true,
        port: 9000
    },
    mode: 'development'
};
